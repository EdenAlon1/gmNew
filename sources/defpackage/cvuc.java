package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvuc {
    public final ffix a;
    public final ffix b;
    private final cwjb c;

    public cvuc() {
        this(null, 7);
    }

    public final boolean a() {
        return this.c.d();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cvuc)) {
            return false;
        }
        cvuc cvucVar = (cvuc) obj;
        return this.c == cvucVar.c && ffkj.e(this.a, cvucVar.a) && ffkj.e(this.b, cvucVar.b);
    }

    public final int hashCode() {
        return (((this.c.hashCode() * 31) + this.a.hashCode()) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "CreateGroupUiData(selectionMode=" + this.c + ", onRenderCreateGroupButton=" + this.a + ", onCreateGroupButton=" + this.b + ")";
    }

    public cvuc(cwjb cwjbVar, ffix ffixVar, ffix ffixVar2) {
        cwjbVar.getClass();
        this.c = cwjbVar;
        this.a = ffixVar;
        this.b = ffixVar2;
    }

    public /* synthetic */ cvuc(cwjb cwjbVar, int i) {
        this((i & 1) != 0 ? cwjb.c : cwjbVar, new ffix() { // from class: cvua
            @Override // defpackage.ffix
            public final Object invoke() {
                return ffcu.a;
            }
        }, new ffix() { // from class: cvub
            @Override // defpackage.ffix
            public final Object invoke() {
                return ffcu.a;
            }
        });
    }
}
