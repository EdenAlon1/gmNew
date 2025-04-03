package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.conversation2.api.OpenConversation2Arguments;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wrj implements wqq {
    public final Context a;
    public final aigz b;
    public final OpenConversation2Arguments c;
    private final ffxx d;
    private final Set e;

    public wrj(Context context, aigz aigzVar, ffxx ffxxVar, ffxx ffxxVar2, zep zepVar, OpenConversation2Arguments openConversation2Arguments) {
        context.getClass();
        aigzVar.getClass();
        ffxxVar.getClass();
        ffxxVar2.getClass();
        zepVar.getClass();
        openConversation2Arguments.getClass();
        this.a = context;
        this.b = aigzVar;
        this.c = openConversation2Arguments;
        zeq zeqVar = zeq.a;
        zeqVar.getClass();
        if (!zepVar.a.containsKey(zeqVar)) {
            zepVar.a.put(zeqVar, fgdm.a(null));
        }
        Object obj = zepVar.a.get(zeqVar);
        obj.getClass();
        this.d = fgck.a(ffxxVar, ffxxVar2, (ffxx) obj, new wri(this, null));
        this.e = fffi.b(aaxf.a);
    }

    @Override // defpackage.wqq
    public final Set a() {
        return this.e;
    }

    @Override // defpackage.wqq
    public final ffxx b() {
        return this.d;
    }
}
