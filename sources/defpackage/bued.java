package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bued extends duak {
    public bued() {
        super("message_reactions");
    }

    @Override // defpackage.duak
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final buec b() {
        ah();
        return new buec(this.c, this.a, this.b, this.d.g(), this.e.g());
    }

    public final void c(MessageIdType messageIdType) {
        String[] strArr = bueg.a;
        buef buefVar = new buef();
        buefVar.b(messageIdType);
        aj(new buee(buefVar), "message_reactions-buildAndUpdateForMessageId");
    }

    public final void d() {
        this.a.putNull("animation_effect");
    }

    public final void e(cmrf cmrfVar) {
        if (cmrfVar == null) {
            this.a.putNull("reactions_data");
        } else {
            this.a.put("reactions_data", cmrfVar.toByteArray());
        }
    }

    public final void f(Function function) {
        Object apply;
        String[] strArr = bueg.a;
        apply = function.apply(new buef());
        af(new buee((buef) apply));
    }
}
