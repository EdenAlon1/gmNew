package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cykq extends cykw {
    private final ParticipantsTable.BindData a;
    private final byyt b;
    private final int c;

    public cykq(ParticipantsTable.BindData bindData, int i, byyt byytVar) {
        this.a = bindData;
        this.c = i;
        if (byytVar == null) {
            throw new NullPointerException("Null archiveStatus");
        }
        this.b = byytVar;
    }

    @Override // defpackage.cykw
    public final ParticipantsTable.BindData a() {
        return this.a;
    }

    @Override // defpackage.cykw
    public final byyt b() {
        return this.b;
    }

    @Override // defpackage.cykw
    public final int c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cykw) {
            cykw cykwVar = (cykw) obj;
            ParticipantsTable.BindData bindData = this.a;
            if (bindData != null ? bindData.equals(cykwVar.a()) : cykwVar.a() == null) {
                if (this.c == cykwVar.c() && this.b.equals(cykwVar.b())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        ParticipantsTable.BindData bindData = this.a;
        return (((((bindData == null ? 0 : bindData.hashCode()) ^ 1000003) * 1000003) ^ this.c) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        byyt byytVar = this.b;
        return "UnblockUnspamBannerLoadedData{targetParticipant=" + String.valueOf(this.a) + ", bannerType=" + cykx.a(this.c) + ", archiveStatus=" + byytVar.toString() + "}";
    }
}
