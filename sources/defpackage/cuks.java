package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cuks {
    public final ffbr a;
    public final ffbr b;
    public final ffbr c;
    public final ffbr d;
    public final ffbr e;
    public final ffbr f;
    private final ffsk g;

    public cuks(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffsk ffskVar) {
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        ffbrVar4.getClass();
        ffbrVar5.getClass();
        ffbrVar6.getClass();
        ffskVar.getClass();
        this.a = ffbrVar;
        this.b = ffbrVar2;
        this.c = ffbrVar3;
        this.d = ffbrVar4;
        this.e = ffbrVar5;
        this.f = ffbrVar6;
        this.g = ffskVar;
    }

    public final void a(MessageIdType messageIdType, String str) {
        messageIdType.getClass();
        if (((Set) this.a.b()).isEmpty()) {
            return;
        }
        ekzz f = eleg.f("UrlClickSpamProtectionEntrypoint.classifyOnClick");
        try {
            axol.k(this.g, null, new cukr(this, messageIdType, str, null), 3);
            ffig.a(f, null);
        } finally {
        }
    }
}
