package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.ParticipantColor;
import j$.util.Objects;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvhf {
    private final String a;
    private final String b;
    private final ParticipantColor c;

    public cvhf(String str, String str2, Optional optional) {
        this.a = str;
        this.b = str2;
        this.c = (ParticipantColor) optional.orElse(new ParticipantColor());
    }

    public final dhzq a() {
        dhzq dhzqVar = new dhzq();
        dhzqVar.n("1", this.a);
        String str = this.b;
        if (str != null) {
            dhzqVar.n("4", str);
        }
        ParticipantColor participantColor = this.c;
        dhzqVar.l("2", participantColor.a);
        dhzqVar.l("3", participantColor.b);
        dhzqVar.l("5", participantColor.c);
        return dhzqVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cvhf) {
            return a().equals(((cvhf) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.b, this.a);
    }
}
