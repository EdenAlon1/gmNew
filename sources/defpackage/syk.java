package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class syk extends taf {
    public Runnable a;
    public ParticipantsTable.BindData b;
    public tah c;
    public tai d;
    public int e;
    public int f;
    private taj g;
    private ConversationIdType h;
    private int i;
    private byte j;
    private int k;

    @Override // defpackage.taf
    public final tak a() {
        taj tajVar;
        int i;
        Runnable runnable;
        ConversationIdType conversationIdType;
        int i2;
        int i3;
        tah tahVar;
        tai taiVar;
        if (this.j == 1 && (tajVar = this.g) != null && (i = this.e) != 0 && (runnable = this.a) != null && (conversationIdType = this.h) != null && (i2 = this.k) != 0 && (i3 = this.f) != 0 && (tahVar = this.c) != null && (taiVar = this.d) != null) {
            return new syl(tajVar, i, runnable, conversationIdType, this.b, i2, i3, tahVar, taiVar, this.i);
        }
        StringBuilder sb = new StringBuilder();
        if (this.g == null) {
            sb.append(" dialogType");
        }
        if (this.e == 0) {
            sb.append(" dialogDoneBehavior");
        }
        if (this.a == null) {
            sb.append(" onPositiveAction");
        }
        if (this.h == null) {
            sb.append(" conversationId");
        }
        if (this.k == 0) {
            sb.append(" scope");
        }
        if (this.f == 0) {
            sb.append(" entryPoint");
        }
        if (this.c == null) {
            sb.append(" dialogLoggingSource");
        }
        if (this.d == null) {
            sb.append(" dialogTarget");
        }
        if (this.j == 0) {
            sb.append(" anchorViewId");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.taf
    public final void b(int i) {
        this.i = i;
        this.j = (byte) 1;
    }

    @Override // defpackage.taf
    public final void c(ConversationIdType conversationIdType) {
        if (conversationIdType == null) {
            throw new NullPointerException("Null conversationId");
        }
        this.h = conversationIdType;
    }

    @Override // defpackage.taf
    public final void d(taj tajVar) {
        if (tajVar == null) {
            throw new NullPointerException("Null dialogType");
        }
        this.g = tajVar;
    }

    @Override // defpackage.taf
    public final void e() {
        this.k = 3;
    }
}
