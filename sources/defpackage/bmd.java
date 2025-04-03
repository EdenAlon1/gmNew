package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bmd extends boa {
    public final bnr a;
    public final List b;

    public bmd(bnr bnrVar, List list) {
        if (bnrVar == null) {
            throw new NullPointerException("Null surfaceEdge");
        }
        this.a = bnrVar;
        if (list == null) {
            throw new NullPointerException("Null outConfigs");
        }
        this.b = list;
    }

    @Override // defpackage.boa
    public final bnr a() {
        return this.a;
    }

    @Override // defpackage.boa
    public final List b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof boa) {
            boa boaVar = (boa) obj;
            if (this.a.equals(boaVar.a()) && this.b.equals(boaVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "In{surfaceEdge=" + this.a + ", outConfigs=" + this.b + "}";
    }
}
