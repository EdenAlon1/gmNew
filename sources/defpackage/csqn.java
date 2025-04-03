package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csqn extends csrb {
    public final csqz a;
    public final csqz b;

    public csqn(csqz csqzVar, csqz csqzVar2) {
        this.a = csqzVar;
        this.b = csqzVar2;
    }

    @Override // defpackage.csrb
    public final csqz a() {
        return this.b;
    }

    @Override // defpackage.csrb
    public final csqz b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof csrb) {
            csrb csrbVar = (csrb) obj;
            if (this.a.equals(csrbVar.b()) && this.b.equals(csrbVar.a())) {
                csrbVar.c();
                csrbVar.d();
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * (-721379959)) ^ 1231;
    }

    public final String toString() {
        csqz csqzVar = this.b;
        return "FilteredContactCursors{personalDirectoryResult=" + this.a.toString() + ", enterpriseDirectoryResult=" + csqzVar.toString() + ", nonDefaultDirectoriesResultList=null, sorted=true}";
    }

    @Override // defpackage.csrb
    public final void c() {
    }

    @Override // defpackage.csrb
    public final void d() {
    }
}
