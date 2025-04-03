package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ouz implements AutoCloseable {
    public final oxi a;

    public ouz(oxi oxiVar) {
        this.a = oxiVar;
    }

    public final ovi a(String str) {
        String obj = ffpc.x(str).toString();
        int length = obj.length();
        oxi oxiVar = this.a;
        if (length >= 3) {
            String substring = obj.substring(0, 3);
            substring.getClass();
            String upperCase = substring.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            int hashCode = upperCase.hashCode();
            if (hashCode == 79487 ? upperCase.equals("PRA") : !(hashCode == 81978 ? !upperCase.equals("SEL") : !(hashCode == 85954 && upperCase.equals("WIT")))) {
                return new ovg(oxiVar, str);
            }
        }
        return new ovh(oxiVar, str);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }
}
