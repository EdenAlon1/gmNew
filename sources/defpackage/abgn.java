package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abgn {
    public final abgx a;
    public final ffix b;
    public final ffix c;
    public final ffji d;
    public final abgm e;
    public final ffji f;

    public abgn(abgx abgxVar, ffix ffixVar, ffix ffixVar2, ffji ffjiVar, abgm abgmVar, ffji ffjiVar2) {
        ffixVar.getClass();
        ffixVar2.getClass();
        ffjiVar.getClass();
        abgmVar.getClass();
        this.a = abgxVar;
        this.b = ffixVar;
        this.c = ffixVar2;
        this.d = ffjiVar;
        this.e = abgmVar;
        this.f = ffjiVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof abgn)) {
            return false;
        }
        abgn abgnVar = (abgn) obj;
        return ffkj.e(this.a, abgnVar.a) && ffkj.e(this.b, abgnVar.b) && ffkj.e(this.c, abgnVar.c) && ffkj.e(this.d, abgnVar.d) && ffkj.e(this.e, abgnVar.e) && ffkj.e(this.f, abgnVar.f);
    }

    public final int hashCode() {
        int hashCode = (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
        ffji ffjiVar = this.f;
        return (hashCode * 31) + (ffjiVar == null ? 0 : ffjiVar.hashCode());
    }

    public final String toString() {
        return "ReactionBottomSheetPickerUiData(params=" + this.a + ", onDismiss=" + this.b + ", onCancel=" + this.c + ", onSelectEmoji=" + this.d + ", customStickerHandler=" + this.e + ", onCameraGalleryMediaSelected=" + this.f + ")";
    }

    public /* synthetic */ abgn(abgx abgxVar, ffix ffixVar, ffix ffixVar2, ffji ffjiVar, abgm abgmVar, ffji ffjiVar2, int i) {
        this(abgxVar, (i & 2) != 0 ? new ffix() { // from class: abgi
            @Override // defpackage.ffix
            public final Object invoke() {
                return ffcu.a;
            }
        } : ffixVar, (i & 4) != 0 ? new ffix() { // from class: abgj
            @Override // defpackage.ffix
            public final Object invoke() {
                return ffcu.a;
            }
        } : ffixVar2, (i & 8) != 0 ? new ffji() { // from class: abgk
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                ((String) obj).getClass();
                return ffcu.a;
            }
        } : ffjiVar, (i & 16) != 0 ? new abgm() { // from class: abgl
            @Override // defpackage.abgm
            public final void a(dqzc dqzcVar) {
                dqzcVar.getClass();
            }
        } : abgmVar, (i & 32) != 0 ? null : ffjiVar2);
    }
}
