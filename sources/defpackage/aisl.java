package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aisl extends ffhr {
    boolean a;
    /* synthetic */ Object b;
    final /* synthetic */ aisn c;
    int d;
    aisn e;
    MessageIdType f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aisl(aisn aisnVar, ffgu ffguVar) {
        super(ffguVar);
        this.c = aisnVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(null, false, this);
    }
}
