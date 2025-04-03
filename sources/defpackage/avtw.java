package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.ChatMessage;
import com.google.android.rcs.client.messaging.data.ContentType;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avtw {
    private static final avty a = new avty();

    public static final awul a(ChatMessage chatMessage) {
        awuk awukVar = (awuk) awul.a.createBuilder();
        awup awupVar = (awup) a.m().fP(ContentType.e(chatMessage.getContentType()));
        awukVar.copyOnWrite();
        awul awulVar = (awul) awukVar.instance;
        awupVar.getClass();
        awulVar.c = awupVar;
        awulVar.b |= 1;
        eyee x = eyee.x(chatMessage.getContent());
        awukVar.copyOnWrite();
        awul awulVar2 = (awul) awukVar.instance;
        awulVar2.b |= 2;
        awulVar2.d = x;
        return (awul) awukVar.build();
    }
}
