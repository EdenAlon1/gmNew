package defpackage;

import com.android.vcard.VCardBuilder;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class eidr {
    public static final dktn c = new dktn("CpimMessageContent");

    public static eidq d() {
        eidg eidgVar = new eidg();
        eidgVar.c(eyee.b);
        return eidgVar;
    }

    public abstract engw a();

    public abstract eyee b();

    public abstract Optional c();

    /* JADX WARN: Multi-variable type inference failed */
    public final String e() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ((enou) a()).c; i += 2) {
            sb.append((String) a().get(i));
            sb.append(": ");
            sb.append((String) a().get(i + 1));
            sb.append(VCardBuilder.VCARD_END_OF_LINE);
        }
        sb.append(VCardBuilder.VCARD_END_OF_LINE);
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Optional f() {
        emxf.b(((enou) a()).c % 2 == 0, "No even number of headers entries!");
        for (int i = 0; i < ((enou) a()).c; i += 2) {
            if (emuz.e((CharSequence) a().get(i), fhpi.a)) {
                return Optional.of((String) a().get(i + 1));
            }
        }
        return Optional.empty();
    }
}
