package defpackage;

import com.google.android.apps.messaging.ui.debug.LoadMessagesReceiver;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class daws extends ffhr {
    public Object a;
    public int b;
    public boolean c;
    public /* synthetic */ Object d;
    final /* synthetic */ LoadMessagesReceiver e;
    public int f;
    public LoadMessagesReceiver g;
    public fflb h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public daws(LoadMessagesReceiver loadMessagesReceiver, ffgu ffguVar) {
        super(ffguVar);
        this.e = loadMessagesReceiver;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.i(0, null, false, this);
    }
}
