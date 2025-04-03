package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmkg {
    public final boolean a;
    public final ffix b;
    public final ffix c;

    public dmkg() {
        this(true, new ffix() { // from class: dmkf
            @Override // defpackage.ffix
            public final Object invoke() {
                return ffcu.a;
            }
        }, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dmkg)) {
            return false;
        }
        dmkg dmkgVar = (dmkg) obj;
        return this.a == dmkgVar.a && ffkj.e(this.b, dmkgVar.b) && ffkj.e(this.c, dmkgVar.c);
    }

    public final int hashCode() {
        int hashCode = ((true != this.a ? 1237 : 1231) * 31) + this.b.hashCode();
        ffix ffixVar = this.c;
        return (hashCode * 31) + (ffixVar == null ? 0 : ffixVar.hashCode());
    }

    public final String toString() {
        return "CameraGalleryInputUiData(isEnabled=" + this.a + ", onLongPress=" + this.b + ", onShowCameraGalleryButton=" + this.c + ")";
    }

    public dmkg(boolean z, ffix ffixVar, ffix ffixVar2) {
        ffixVar.getClass();
        this.a = z;
        this.b = ffixVar;
        this.c = ffixVar2;
    }
}
