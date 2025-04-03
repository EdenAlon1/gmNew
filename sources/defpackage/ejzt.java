package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public interface ejzt {
    static {
        ejzr ejzrVar = new ejzr();
        ejzrVar.a(eyee.b);
        ejzrVar.a(eyee.b);
        ejzrVar.b = (byte) 1;
        ejzrVar.c = 1;
        if (ejzrVar.a != null) {
            emxf.m(true, "setProto is only compatible with type PROTO");
            return;
        }
        StringBuilder sb = new StringBuilder();
        if (ejzrVar.a == null) {
            sb.append(" data");
        }
        if (ejzrVar.c == 0) {
            sb.append(" type");
        }
        if (ejzrVar.b == 0) {
            sb.append(" containsPii");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
