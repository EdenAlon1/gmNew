package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzab extends dzba {
    public dzpg a;
    private int b;
    private String c;
    private List d;
    private dzpt e;
    private byte f;

    @Override // defpackage.dzba
    public final dzbb a() {
        String str;
        List list;
        dzpg dzpgVar;
        dzpt dzptVar;
        if (this.f == 1 && (str = this.c) != null && (list = this.d) != null && (dzpgVar = this.a) != null && (dzptVar = this.e) != null) {
            return new dzac(this.b, str, list, dzpgVar, dzptVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f == 0) {
            sb.append(" receiptType");
        }
        if (this.c == null) {
            sb.append(" receiptId");
        }
        if (this.d == null) {
            sb.append(" messageIds");
        }
        if (this.a == null) {
            sb.append(" recipient");
        }
        if (this.e == null) {
            sb.append(" conversationId");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dzba
    public final void b(dzpt dzptVar) {
        if (dzptVar == null) {
            throw new NullPointerException("Null conversationId");
        }
        this.e = dzptVar;
    }

    @Override // defpackage.dzba
    public final void c(List list) {
        if (list == null) {
            throw new NullPointerException("Null messageIds");
        }
        this.d = list;
    }

    @Override // defpackage.dzba
    public final void d(String str) {
        if (str == null) {
            throw new NullPointerException("Null receiptId");
        }
        this.c = str;
    }

    @Override // defpackage.dzba
    public final void e(int i) {
        this.b = i;
        this.f = (byte) 1;
    }
}
