package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qio implements qil {
    public final String a;
    public final qhx b;
    public final qhy c;
    public final qia d;
    public final qia e;
    public final qhw f;
    public final float g;
    public final List h;
    public final qhw i;
    public final boolean j;
    public final int k;
    public final int l;
    public final int m;

    public qio(String str, int i, qhx qhxVar, qhy qhyVar, qia qiaVar, qia qiaVar2, qhw qhwVar, int i2, int i3, float f, List list, qhw qhwVar2, boolean z) {
        this.a = str;
        this.k = i;
        this.b = qhxVar;
        this.c = qhyVar;
        this.d = qiaVar;
        this.e = qiaVar2;
        this.f = qhwVar;
        this.l = i2;
        this.m = i3;
        this.g = f;
        this.h = list;
        this.i = qhwVar2;
        this.j = z;
    }

    @Override // defpackage.qil
    public final qdu a(qdb qdbVar, qci qciVar, qje qjeVar) {
        return new qea(qdbVar, qjeVar, this);
    }
}
