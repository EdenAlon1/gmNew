package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwaa implements dvwk, dvzx {
    public final erhm a;
    public final List b;
    public final dvxh c;
    public final long d;
    public final boolean e;

    public dwaa(erhm erhmVar, List list, dvxh dvxhVar, long j, boolean z) {
        this.a = erhmVar;
        this.b = list;
        this.c = dvxhVar;
        this.d = j;
        this.e = z;
    }

    @Override // defpackage.dvzx
    public final /* synthetic */ dvxr a() {
        return dvzw.a(this);
    }

    @Override // defpackage.dvzx
    public final List b() {
        return this.b;
    }

    public final String toString() {
        emwz b = emxa.b(this);
        erhk erhkVar = dvzw.a(this).d;
        if (erhkVar == null) {
            erhkVar = erhk.a;
        }
        b.f("rootVeId", erhkVar.d);
        erhk erhkVar2 = dvzw.b(this).d;
        if (erhkVar2 == null) {
            erhkVar2 = erhk.a;
        }
        b.f("targetVeId", erhkVar2.d);
        return b.toString();
    }
}
