package defpackage;

import defpackage.eyfs;
import defpackage.eyft;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class eyfs<MessageType extends eyft<MessageType, BuilderType>, BuilderType extends eyfs<MessageType, BuilderType>> extends eyfq<MessageType, BuilderType> implements eyfu<MessageType, BuilderType> {
    protected eyfs(eyft eyftVar) {
        super(eyftVar);
    }

    public final eyfj a() {
        eyfj eyfjVar = ((eyft) this.instance).r;
        if (!eyfjVar.c) {
            return eyfjVar;
        }
        eyfj clone = eyfjVar.clone();
        ((eyft) this.instance).r = clone;
        return clone;
    }

    @Override // defpackage.eyfq, defpackage.eyhr
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final eyft buildPartial() {
        if (!((eyft) this.instance).isMutable()) {
            return (eyft) this.instance;
        }
        ((eyft) this.instance).r.f();
        return (eyft) super.buildPartial();
    }

    public final void c(eyfw eyfwVar) {
        if (eyfwVar.a != getDefaultInstanceForType()) {
            throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }
    }

    @Override // defpackage.eyfq
    protected final void copyOnWriteInternal() {
        super.copyOnWriteInternal();
        if (((eyft) this.instance).r != eyfj.a) {
            eyft eyftVar = (eyft) this.instance;
            eyftVar.r = eyftVar.r.clone();
        }
    }

    @Override // defpackage.eyfu
    public final boolean d(eyfa eyfaVar) {
        eyfw checkIsLite;
        eyft eyftVar = (eyft) this.instance;
        checkIsLite = eyfy.checkIsLite(eyfaVar);
        eyftVar.b(checkIsLite);
        return eyftVar.r.o(checkIsLite.d);
    }

    public final void e(eyfa eyfaVar, Object obj) {
        eyfw checkIsLite;
        checkIsLite = eyfy.checkIsLite(eyfaVar);
        c(checkIsLite);
        copyOnWrite();
        eyfj a = a();
        eyfv eyfvVar = checkIsLite.d;
        if (!eyfvVar.d) {
            obj = checkIsLite.e(obj);
        } else if (eyfvVar.a() == eyjs.ENUM) {
            ArrayList arrayList = new ArrayList();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                arrayList.add(checkIsLite.e(it.next()));
            }
            obj = arrayList;
        }
        a.n(eyfvVar, obj);
    }
}
