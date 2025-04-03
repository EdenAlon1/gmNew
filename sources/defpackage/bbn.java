package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bbn extends bgh {
    public final bdy a;
    private final List b;
    private final int c;
    private final aua d;

    public bbn(bdy bdyVar, List list, int i, aua auaVar) {
        this.a = bdyVar;
        this.b = list;
        this.c = i;
        this.d = auaVar;
    }

    @Override // defpackage.bgh
    public final int a() {
        return this.c;
    }

    @Override // defpackage.bgh
    public final aua b() {
        return this.d;
    }

    @Override // defpackage.bgh
    public final bdy c() {
        return this.a;
    }

    @Override // defpackage.bgh
    public final List d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bgh) {
            bgh bghVar = (bgh) obj;
            if (this.a.equals(bghVar.c()) && this.b.equals(bghVar.d())) {
                bghVar.e();
                if (this.c == bghVar.a()) {
                    bghVar.f();
                    if (this.d.equals(bghVar.b())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((~((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * (-721379959)) ^ this.c) * 1000003)) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        return "OutputConfig{surface=" + this.a + ", sharedSurfaces=" + this.b + ", physicalCameraId=null, mirrorMode=" + this.c + ", surfaceGroupId=-1, dynamicRange=" + this.d + "}";
    }

    @Override // defpackage.bgh
    public final void e() {
    }

    @Override // defpackage.bgh
    public final void f() {
    }
}
