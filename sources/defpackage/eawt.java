package defpackage;

import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class eawt implements Comparable {
    public abstract Drawable a();

    public abstract eawu b();

    public abstract String c();

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return b().a().compareTo(((eawt) obj).b().a());
    }
}
