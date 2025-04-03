package defpackage;

import com.google.android.apps.messaging.ui.debug.LoadMessagesReceiver;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dawu extends ffhr {
    public /* synthetic */ Object a;
    final /* synthetic */ LoadMessagesReceiver b;
    public int c;
    public LoadMessagesReceiver d;
    public String e;
    public String f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dawu(LoadMessagesReceiver loadMessagesReceiver, ffgu ffguVar) {
        super(ffguVar);
        this.b = loadMessagesReceiver;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.j(null, null, this);
    }
}
