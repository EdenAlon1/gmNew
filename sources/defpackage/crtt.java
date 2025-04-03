package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class crtt extends csbx {
    public bxro a;
    private ParticipantsTable.BindData b;
    private long c;
    private byte d;

    @Override // defpackage.csbx
    public final csby a() {
        ParticipantsTable.BindData bindData;
        if (this.d == 1 && (bindData = this.b) != null) {
            return new crtu(bindData, this.c, this.a);
        }
        StringBuilder sb = new StringBuilder();
        if (this.b == null) {
            sb.append(" participant");
        }
        if (this.d == 0) {
            sb.append(" linkPreviewCount");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.csbx
    public final void b(long j) {
        this.c = j;
        this.d = (byte) 1;
    }

    @Override // defpackage.csbx
    public final void c(ParticipantsTable.BindData bindData) {
        if (bindData == null) {
            throw new NullPointerException("Null participant");
        }
        this.b = bindData;
    }
}
