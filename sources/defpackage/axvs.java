package defpackage;

import j$.time.Instant;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axvs {
    public static final aydh a(axvr axvrVar) {
        axvrVar.getClass();
        aydg aydgVar = (aydg) aydh.a.createBuilder();
        aydgVar.copyOnWrite();
        ((aydh) aydgVar.instance).b = axvrVar.a;
        long epochMilli = axvrVar.b.toEpochMilli();
        aydgVar.copyOnWrite();
        ((aydh) aydgVar.instance).c = epochMilli;
        eyfy build = aydgVar.build();
        build.getClass();
        return (aydh) build;
    }

    public static final Instant b(List list) {
        list.getClass();
        if (list.isEmpty()) {
            throw new IllegalStateException("Check failed.");
        }
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Instant instant = ((axvr) it.next()).b;
        while (it.hasNext()) {
            Instant instant2 = ((axvr) it.next()).b;
            if (instant.compareTo(instant2) > 0) {
                instant = instant2;
            }
        }
        return instant;
    }
}
