package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.ChatMessage;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public abstract class caes {
    public static caes d(fays faysVar, ChatMessage chatMessage) {
        return new bzvg(faysVar, chatMessage, Optional.empty());
    }

    public static caes e(bzwg bzwgVar) {
        return new bzvg(null, null, Optional.of(bzwgVar));
    }

    public abstract ChatMessage a();

    public abstract fays b();

    public abstract Optional c();
}
