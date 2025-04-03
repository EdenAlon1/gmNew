package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cbzm extends ccuc {
    public MessagesTable.BindData a;
    public engw b;
    public bton c;
    private String d;
    private Optional e = Optional.empty();

    @Override // defpackage.ccuc
    public final ccud a() {
        MessagesTable.BindData bindData;
        engw engwVar;
        String str = this.d;
        if (str != null && (bindData = this.a) != null && (engwVar = this.b) != null) {
            return new cbzn(str, bindData, engwVar, this.e, this.c);
        }
        StringBuilder sb = new StringBuilder();
        if (this.d == null) {
            sb.append(" cmsId");
        }
        if (this.a == null) {
            sb.append(" messagesTableBindData");
        }
        if (this.b == null) {
            sb.append(" partsTableBindDataList");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.ccuc
    public final void b(eshh eshhVar) {
        this.e = Optional.of(eshhVar);
    }

    @Override // defpackage.ccuc
    public final void c(String str) {
        if (str == null) {
            throw new NullPointerException("Null cmsId");
        }
        this.d = str;
    }
}
