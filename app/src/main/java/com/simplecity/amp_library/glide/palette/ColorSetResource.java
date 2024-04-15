package com.simplecity.amp_library.glide.palette;

import android.support.annotation.NonNull;
import com.bumptech.glide.load.engine.Resource;

public class ColorSetResource implements Resource<ColorSet> {
    private final ColorSet colorSet;

    public ColorSetResource(@NonNull ColorSet colorSet) {
        this.colorSet = colorSet;
    }

    @Override
    public ColorSet get() {
        return colorSet;
    }

    @Override
    public int getSize() {
        return ColorSet.Companion.estimatedSize();
    }

    @Override
    public void recycle() {
    // Cette méthode est laissée vide car la classe actuelle ne nécessite pas de recyclage explicite.
    // Si une implémentation spécifique de recyclage est nécessaire à l'avenir, elle peut être ajoutée ici.
    // Pour l'instant, l'utilisation de cette méthode ne provoque aucun effet.
    throw new UnsupportedOperationException("La méthode recycle() doit être implémentée si nécessaire.");
}
}