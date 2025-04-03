package defpackage;

import com.google.android.apps.messaging.startchat.StartChatActivity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvqm {
    public final StartChatActivity a;
    public final ffbr b;
    private final ffbr c;

    public cvqm(StartChatActivity startChatActivity, ffbr ffbrVar, ffbr ffbrVar2) {
        this.a = startChatActivity;
        this.c = ffbrVar;
        this.b = ffbrVar2;
        eiwy e = eiwz.e(startChatActivity);
        e.d(ejgc.class);
        e.d(ejed.class);
        ((eito) ffbrVar.b()).e(new cvql(this, startChatActivity.getIntent().getExtras()));
        ((eito) ffbrVar.b()).g(e.a());
    }
}
