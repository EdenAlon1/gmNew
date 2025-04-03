package defpackage;

import java.util.Map;

/* compiled from: PG */
@Deprecated
/* loaded from: classes5.dex */
public abstract class ehzx {
    public static final /* synthetic */ int a = 0;

    static {
        emvz emvzVar = emvk.a;
        emvz emvzVar2 = emvs.a;
        emvz.m("()<>@,;:\\\"/[]?=");
        emvz.m("\"\\\r");
        emvz.l(" \t\r\n");
    }

    public abstract enhk a();

    public abstract String b();

    public abstract String c();

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(c());
        sb.append('/');
        sb.append(b());
        enqu listIterator = a().entrySet().listIterator();
        while (listIterator.hasNext()) {
            Map.Entry entry = (Map.Entry) listIterator.next();
            sb.append("; ");
            sb.append((String) entry.getKey());
            sb.append('=');
            sb.append((String) entry.getValue());
        }
        return sb.toString();
    }
}
