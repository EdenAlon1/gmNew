package defpackage;

import com.google.android.ims.network.common.RcsEngine;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkeu extends dkfy {
    public final RcsEngine a;
    public final ezjz b;

    public dkeu(RcsEngine rcsEngine, ezjz ezjzVar) {
        if (rcsEngine == null) {
            throw new NullPointerException("Null rcsEngine");
        }
        this.a = rcsEngine;
        if (ezjzVar == null) {
            throw new NullPointerException("Null parameters");
        }
        this.b = ezjzVar;
    }

    @Override // defpackage.dkfy
    public final RcsEngine a() {
        return this.a;
    }

    @Override // defpackage.dkfy
    public final ezjz b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dkfy) {
            dkfy dkfyVar = (dkfy) obj;
            if (this.a.equals(dkfyVar.a()) && this.b.equals(dkfyVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        ezjz ezjzVar = this.b;
        return "RcsEngineState{rcsEngine=" + this.a.toString() + ", parameters=" + ezjzVar.toString() + "}";
    }
}
