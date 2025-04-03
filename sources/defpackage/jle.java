package defpackage;

import android.graphics.RectF;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jle extends ffkk implements ffjm {
    final /* synthetic */ jpd a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jle(jpd jpdVar) {
        super(2);
        this.a = jpdVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return Boolean.valueOf(this.a.a(icz.e((RectF) obj), icz.e((RectF) obj2)));
    }
}
