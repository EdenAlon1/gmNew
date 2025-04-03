package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlzf implements dnoq {
    public final dlwk a;
    public final dlze b;
    public final String c;
    public final boolean d;
    public final ffix e;
    private final ffix f;

    public dlzf(dlwk dlwkVar, dlze dlzeVar, String str, boolean z, ffix ffixVar, ffix ffixVar2) {
        ffixVar.getClass();
        this.a = dlwkVar;
        this.b = dlzeVar;
        this.c = str;
        this.d = z;
        this.f = ffixVar;
        this.e = ffixVar2;
    }

    public static /* synthetic */ dlzf e(dlzf dlzfVar, dlwk dlwkVar, String str, boolean z, int i) {
        if ((i & 1) != 0) {
            dlwkVar = dlzfVar.a;
        }
        dlwk dlwkVar2 = dlwkVar;
        dlze dlzeVar = (i & 2) != 0 ? dlzfVar.b : null;
        if ((i & 4) != 0) {
            str = dlzfVar.c;
        }
        String str2 = str;
        if ((i & 8) != 0) {
            z = dlzfVar.d;
        }
        ffix ffixVar = dlzfVar.f;
        ffix ffixVar2 = dlzfVar.e;
        dlwkVar2.getClass();
        dlzeVar.getClass();
        return new dlzf(dlwkVar2, dlzeVar, str2, z, ffixVar, ffixVar2);
    }

    @Override // defpackage.dnoq
    public final String a() {
        throw null;
    }

    @Override // defpackage.dnoq
    public final ffix b() {
        return this.f;
    }

    @Override // defpackage.dnoq
    public final ffix c() {
        throw null;
    }

    @Override // defpackage.dnoq
    public final boolean d() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dlzf)) {
            return false;
        }
        dlzf dlzfVar = (dlzf) obj;
        return ffkj.e(this.a, dlzfVar.a) && ffkj.e(this.b, dlzfVar.b) && ffkj.e(this.c, dlzfVar.c) && this.d == dlzfVar.d && ffkj.e(this.f, dlzfVar.f) && ffkj.e(this.e, dlzfVar.e);
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        String str = this.c;
        return (((((((hashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + (true != this.d ? 1237 : 1231)) * 31) + this.f.hashCode()) * 31) + this.e.hashCode();
    }

    public final String toString() {
        return "AttachmentBubbleUiData(info=" + this.a + ", flags=" + this.b + ", contentDescription=" + this.c + ", isHighlighted=" + this.d + ", onClick=" + this.f + ", onLayout=" + this.e + ")";
    }

    public /* synthetic */ dlzf(dlwk dlwkVar, dlze dlzeVar, String str, boolean z, ffix ffixVar, int i) {
        this(dlwkVar, (i & 2) != 0 ? new dlze(null) : dlzeVar, str, ((i & 8) == 0) & z, (i & 16) != 0 ? new ffix() { // from class: dlzb
            @Override // defpackage.ffix
            public final Object invoke() {
                return false;
            }
        } : ffixVar, new ffix() { // from class: dlzc
            @Override // defpackage.ffix
            public final Object invoke() {
                return ffcu.a;
            }
        });
    }
}
