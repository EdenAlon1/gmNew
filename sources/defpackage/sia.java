package defpackage;

import com.android.vcard.VCardConfig;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sia {
    private final ffbr a;

    public sia(ffbr ffbrVar) {
        ffbrVar.getClass();
        this.a = ffbrVar;
    }

    public static final int b(Duration duration) {
        int seconds = (int) duration.getSeconds();
        return seconds - (seconds % 5);
    }

    public static final int c(int i) {
        if (i != 1) {
            return i != 2 ? 1 : 3;
        }
        return 2;
    }

    public static final int d(int i) {
        int i2 = i - 2;
        if (i2 != 1) {
            return i2 != 2 ? 1 : 3;
        }
        return 2;
    }

    public final void a(erch erchVar) {
        akxl akxlVar = (akxl) this.a.b();
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eolt eoltVar = eolt.VMT_SESSION_EVENT;
        eoluVar.copyOnWrite();
        eolv eolvVar = (eolv) eoluVar.instance;
        eolvVar.j = eoltVar.dk;
        eolvVar.b |= 1;
        eoluVar.copyOnWrite();
        eolv eolvVar2 = (eolv) eoluVar.instance;
        eolvVar2.bs = erchVar;
        eolvVar2.f |= VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING;
        akxlVar.o(eoluVar);
    }
}
