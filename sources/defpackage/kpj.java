package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kpj {
    public final ColorStateList a;
    public final Configuration b;
    public final int c;

    public kpj(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        this.a = colorStateList;
        this.b = configuration;
        this.c = theme == null ? 0 : theme.hashCode();
    }
}
