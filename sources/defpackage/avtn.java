package defpackage;

import com.google.android.rcs.client.messaging.data.ChatMessage;
import com.google.android.rcs.client.messaging.data.ContentType;

/* compiled from: PG */
/* loaded from: classes6.dex */
class avtn extends emwd {
    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        ChatMessage chatMessage = (ChatMessage) obj;
        awuk awukVar = (awuk) awul.a.createBuilder();
        eyee b = chatMessage.b();
        awukVar.copyOnWrite();
        awul awulVar = (awul) awukVar.instance;
        awulVar.b |= 2;
        awulVar.d = b;
        awup awupVar = (awup) avtv.a.m().fP(chatMessage.a());
        awukVar.copyOnWrite();
        awul awulVar2 = (awul) awukVar.instance;
        awupVar.getClass();
        awulVar2.c = awupVar;
        awulVar2.b |= 1;
        return (awul) awukVar.build();
    }

    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        awul awulVar = (awul) obj;
        eidy eidyVar = new eidy();
        if ((awulVar.b & 1) != 0) {
            emwd emwdVar = avtv.a;
            awup awupVar = awulVar.c;
            if (awupVar == null) {
                awupVar = awup.a;
            }
            eidyVar.c((ContentType) emwdVar.fP(awupVar));
        }
        if ((awulVar.b & 2) != 0) {
            eidyVar.b(awulVar.d);
        }
        return eidyVar.a();
    }
}
