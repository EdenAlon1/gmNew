package defpackage;

import android.text.TextUtils;
import j$.util.Optional;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccvv implements ccum {
    private static final entd b = entd.c("BugleCms");
    public final axkm a;
    private final ffbr c;
    private final ffbr d;
    private final ffsk e;

    public ccvv(ffbr ffbrVar, axkm axkmVar, ffbr ffbrVar2, ffsk ffskVar) {
        ffbrVar.getClass();
        axkmVar.getClass();
        ffbrVar2.getClass();
        ffskVar.getClass();
        this.c = ffbrVar;
        this.a = axkmVar;
        this.d = ffbrVar2;
        this.e = ffskVar;
    }

    @Override // defpackage.ccum
    public final /* synthetic */ Object a(Map map, ccvl ccvlVar, ffgu ffguVar) {
        return ccuf.a(map);
    }

    @Override // defpackage.ccum
    public final void b(axue axueVar, String str, Optional optional, String str2, ccvl ccvlVar) {
        axueVar.getClass();
        ensk o = b.o();
        o.Y(cdii.c, str);
        o.Y(cdii.d, ccvlVar.b.a);
        o.Y(cdii.p, Integer.valueOf(ccvlVar.b.b));
        o.Y(csux.o, str2);
        o.q("Processed CMS conversation backup");
    }

    @Override // defpackage.ccum
    public final Object c(String str, String str2) {
        ensz enszVar = (ensz) b.h();
        enszVar.Y(cdii.c, str);
        enszVar.q("Attempting to recover from ALREADY_EXISTS error for a conversation");
        return ccug.a;
    }

    @Override // defpackage.ccum
    public final Object d(Map map) {
        Object a;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(ffew.a(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            String str = ((eswr) entry.getValue()).c;
            str.getClass();
            if (TextUtils.isEmpty(str) || linkedHashSet.contains(str)) {
                ensz enszVar = (ensz) b.j();
                enszVar.Y(cdii.h, str);
                enszVar.q("Invalid conversationId contained in batch create request.");
                if (TextUtils.isEmpty(str)) {
                    ((akzt) this.d.b()).e("Bugle.Cms.Conversations.BatchInsert.InvalidId.Count", 1);
                } else if (linkedHashSet.contains(str)) {
                    ((akzt) this.d.b()).e("Bugle.Cms.Conversations.BatchInsert.InvalidId.Count", 2);
                } else {
                    ((akzt) this.d.b()).e("Bugle.Cms.Conversations.BatchInsert.InvalidId.Count", 0);
                }
                a = ffci.a(new ccuh((String) entry.getKey()));
            } else {
                linkedHashSet.add(str);
                a = entry.getValue();
            }
            linkedHashMap.put(key, new ffch(a));
        }
        return linkedHashMap;
    }

    @Override // defpackage.ccum
    public final void e(axue axueVar, String str, ccvl ccvlVar) {
        axueVar.getClass();
        ensz enszVar = (ensz) b.j();
        enszVar.Y(cdii.d, ccvlVar.b.a);
        enszVar.Y(cdii.c, str);
        enszVar.Y(cdii.p, Integer.valueOf(ccvlVar.b.b));
        enszVar.q("Failure while processing Cms Conversation.");
    }

    @Override // defpackage.ccum
    public final void f(List list, ccvl ccvlVar) {
        if (csgj.a() && ((asif) this.c.b()).a() && csfx.b(ccvlVar.c)) {
            axol.k(this.e, null, new ccvu(this, list, null), 3);
        }
    }
}
