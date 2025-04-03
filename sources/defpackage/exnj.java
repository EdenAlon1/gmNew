package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class exnj extends exnu {
    public String a;
    public String b;
    public exoa c;
    private String d;
    private List e;
    private List f;
    private byte g;

    @Override // defpackage.exnu
    public final exnv a() {
        String str;
        String str2;
        String str3;
        exoa exoaVar;
        List list;
        List list2;
        if (this.g == 1 && (str = this.d) != null && (str2 = this.a) != null && (str3 = this.b) != null && (exoaVar = this.c) != null && (list = this.e) != null && (list2 = this.f) != null) {
            return new exnk(str, str2, str3, exoaVar, list, list2);
        }
        StringBuilder sb = new StringBuilder();
        if (this.d == null) {
            sb.append(" taskName");
        }
        if (this.a == null) {
            sb.append(" taskRunningModeName");
        }
        if (this.b == null) {
            sb.append(" taskGraphName");
        }
        if (this.c == null) {
            sb.append(" taskOptions");
        }
        if (this.e == null) {
            sb.append(" inputStreams");
        }
        if (this.f == null) {
            sb.append(" outputStreams");
        }
        if (this.g == 0) {
            sb.append(" enableFlowLimiting");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.exnu
    public final void b(List list) {
        if (list == null) {
            throw new NullPointerException("Null inputStreams");
        }
        this.e = list;
    }

    @Override // defpackage.exnu
    public final void c(List list) {
        if (list == null) {
            throw new NullPointerException("Null outputStreams");
        }
        this.f = list;
    }

    @Override // defpackage.exnu
    public final void d(String str) {
        if (str == null) {
            throw new NullPointerException("Null taskName");
        }
        this.d = str;
    }

    @Override // defpackage.exnu
    public final void e() {
        this.g = (byte) 1;
    }
}
