package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zsl {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final ffix e;

    public zsl(boolean z, boolean z2, boolean z3, boolean z4, ffix ffixVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = ffixVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zsl)) {
            return false;
        }
        zsl zslVar = (zsl) obj;
        return this.a == zslVar.a && this.b == zslVar.b && this.c == zslVar.c && this.d == zslVar.d && ffkj.e(this.e, zslVar.e);
    }

    public final int hashCode() {
        int a = zsj.a(this.a);
        ffix ffixVar = this.e;
        boolean z = this.d;
        return (((((((a * 31) + zsj.a(this.b)) * 31) + zsj.a(this.c)) * 31) + zsj.a(z)) * 31) + ffixVar.hashCode();
    }

    public final String toString() {
        return "AnimateParameters(includeMetatextPadding=" + this.a + ", isGroupedWithMessage=" + this.b + ", useExpressiveAnimation=" + this.c + ", isExpressiveAnimationOriginStartAligned=" + this.d + ", onAnimationFinished=" + this.e + ")";
    }

    public zsl() {
        this(true, false, false, false, new ffix() { // from class: zsk
            @Override // defpackage.ffix
            public final Object invoke() {
                return ffcu.a;
            }
        });
    }
}
