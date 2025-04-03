package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzdw {
    public static emxc a(Map map) {
        byte[] bArr = (byte[]) map.get("Lighter");
        if (bArr == null) {
            return emux.a;
        }
        try {
            fbie fbieVar = (fbie) eyfy.parseFrom(fbie.a, ((eydq) eyfy.parseFrom(eydq.a, bArr)).c, eyfc.a());
            HashSet hashSet = new HashSet();
            Iterator<E> it = fbieVar.e.iterator();
            while (it.hasNext()) {
                hashSet.add(dzec.a((fbik) it.next()));
            }
            String str = fbieVar.b;
            if (str == null) {
                throw new NullPointerException("Null handlerId");
            }
            return emxc.j(new dyzw(str, fbieVar.c, fbieVar.d, hashSet));
        } catch (eygu e) {
            dyhr.d("GroupMetadataProtos", "Conversation had invalid lighter app data", e);
            return emux.a;
        }
    }
}
