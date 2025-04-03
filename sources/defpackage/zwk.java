package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.format.Formatter;
import com.google.android.apps.messaging.shared.api.messaging.Conversation;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zwk implements zsq {
    public final aigz a;
    public final alye b;
    private final Context c;
    private final Conversation d;
    private final asnh e;
    private final athc f;

    public zwk(Context context, aigz aigzVar, Conversation conversation, asnh asnhVar, athc athcVar) {
        context.getClass();
        aigzVar.getClass();
        conversation.getClass();
        this.c = context;
        this.a = aigzVar;
        this.d = conversation;
        this.e = asnhVar;
        this.f = athcVar;
        this.b = conversation.c();
    }

    @Override // defpackage.zsq
    public final /* bridge */ /* synthetic */ dnoq a(zsu zsuVar) {
        zwh zwhVar = (zwh) zsuVar;
        apph apphVar = zwhVar.b;
        final Uri e = apphVar.e();
        final String h = apphVar.h();
        final long a = apphVar.a();
        final String b = apphVar.b();
        dlyg a2 = zwf.a(b);
        String formatFileSize = a <= 0 ? "" : Formatter.formatFileSize(this.c, a);
        dnwi dnwiVar = zwhVar.e;
        final alxr alxrVar = zwhVar.a;
        return new dlzf(new dlvy(a2, h, formatFileSize, zwhVar.d, dnwiVar, this.f.a()), new dlze(this.e.a(), this.f.a()), zwhVar.d, zwhVar.c, new ffix() { // from class: zwi
            @Override // defpackage.ffix
            public final Object invoke() {
                zwk.this.a.h(new aiks(e, b, h, a, true));
                return true;
            }
        }, new ffix() { // from class: zwj
            @Override // defpackage.ffix
            public final Object invoke() {
                zwk.this.b.J(alxrVar, 2);
                return ffcu.a;
            }
        });
    }
}
