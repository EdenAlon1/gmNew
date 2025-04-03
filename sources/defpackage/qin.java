package defpackage;

import android.graphics.Path;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qin implements qil {
    public final Path.FillType a;
    public final qhx b;
    public final qhy c;
    public final qia d;
    public final qia e;
    public final String f;
    public final boolean g;
    public final int h;

    public qin(String str, int i, Path.FillType fillType, qhx qhxVar, qhy qhyVar, qia qiaVar, qia qiaVar2, boolean z) {
        this.h = i;
        this.a = fillType;
        this.b = qhxVar;
        this.c = qhyVar;
        this.d = qiaVar;
        this.e = qiaVar2;
        this.f = str;
        this.g = z;
    }

    @Override // defpackage.qil
    public final qdu a(qdb qdbVar, qci qciVar, qje qjeVar) {
        return new qdz(qdbVar, qciVar, qjeVar, this);
    }
}
