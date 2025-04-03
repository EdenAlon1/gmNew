package defpackage;

import com.google.android.ims.rcsservice.chatsession.ChatSessionMessageEvent;
import com.google.android.ims.rcsservice.events.Event;
import com.google.android.ims.rcsservice.events.IEventObserver;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class diqn extends IEventObserver.Stub {
    public int a;
    final /* synthetic */ diqo b;
    private final long c;
    private final String d;

    public diqn(diqo diqoVar, long j, String str) {
        this.b = diqoVar;
        this.c = j;
        this.d = str;
    }

    @Override // com.google.android.ims.rcsservice.events.IEventObserver
    public final void notifyEvent(Event event) {
        if (event.h == 50030 && event.j == this.c && (event instanceof ChatSessionMessageEvent) && this.d.equals(((ChatSessionMessageEvent) event).c)) {
            long j = this.c;
            HashMap hashMap = this.b.f;
            String l = Long.toString(j);
            hashMap.remove(l);
            this.b.b(l);
            diqo diqoVar = this.b;
            diqoVar.d.d(this.a);
        }
    }
}
