package defpackage;

import com.google.android.apps.messaging.ui.debug.LoadMessagesReceiver;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dawo extends ffhr {
    public boolean a;
    public /* synthetic */ Object b;
    final /* synthetic */ LoadMessagesReceiver c;
    public int d;
    public LoadMessagesReceiver e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dawo(LoadMessagesReceiver loadMessagesReceiver, ffgu ffguVar) {
        super(ffguVar);
        this.c = loadMessagesReceiver;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.h(null, 0, 0, false, this);
    }
}
