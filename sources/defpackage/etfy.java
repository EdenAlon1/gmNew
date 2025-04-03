package defpackage;

import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etfy {
    public final List a = new ArrayList();
    private final etrt b = etrt.a;
    private boolean c = false;

    public final etga a() {
        int i;
        etfz etfzVar;
        etzs e;
        if (this.c) {
            throw new GeneralSecurityException("KeysetHandle.Builder#build must only be called once");
        }
        this.c = true;
        etzq etzqVar = (etzq) etzt.a.createBuilder();
        ArrayList arrayList = new ArrayList(this.a.size());
        List list = this.a;
        int i2 = 0;
        while (i2 < list.size() - 1) {
            int i3 = i2 + 1;
            if (((etfw) list.get(i2)).e == etfx.a && ((etfw) list.get(i3)).e != etfx.a) {
                throw new GeneralSecurityException("Entries with 'withRandomId()' may only be followed by other entries with 'withRandomId()'.");
            }
            i2 = i3;
        }
        HashSet hashSet = new HashSet();
        Integer num = null;
        for (etfw etfwVar : this.a) {
            etfu etfuVar = etfwVar.b;
            etfx etfxVar = etfwVar.e;
            if (etfxVar == null) {
                throw new GeneralSecurityException("No ID was set (with withFixedId or withRandomId)");
            }
            if (etfxVar == etfx.a) {
                i = 0;
                while (true) {
                    if (i != 0 && !hashSet.contains(Integer.valueOf(i))) {
                        break;
                    }
                    Charset charset = ettp.a;
                    i = 0;
                    while (i == 0) {
                        byte[] b = ettg.b(4);
                        i = (b[3] & 255) | ((b[0] & 255) << 24) | ((b[1] & 255) << 16) | ((b[2] & 255) << 8);
                    }
                }
            } else {
                i = etfxVar.b;
            }
            Integer valueOf = Integer.valueOf(i);
            if (hashSet.contains(valueOf)) {
                throw new GeneralSecurityException(a.f(i, "Id ", " is used twice in the keyset"));
            }
            hashSet.add(valueOf);
            etfs etfsVar = etfwVar.c;
            if (etfsVar != null) {
                etfzVar = new etfz(etfsVar, etfwVar.b, i, etfwVar.a);
                e = etga.e(etfwVar.c, etfwVar.b, i);
            } else {
                etfs a = etry.a.a(etfwVar.d, true != etfwVar.d.a() ? null : valueOf);
                etfzVar = new etfz(a, etfwVar.b, i, etfwVar.a);
                e = etga.e(a, etfwVar.b, i);
            }
            etzqVar.a(e);
            if (etfwVar.a) {
                if (num != null) {
                    throw new GeneralSecurityException("Two primaries were set");
                }
                if (etfwVar.b != etfu.a) {
                    throw new GeneralSecurityException("Primary key is not enabled");
                }
                num = valueOf;
            }
            arrayList.add(etfzVar);
        }
        if (num == null) {
            throw new GeneralSecurityException("No primary was set");
        }
        int intValue = num.intValue();
        etzqVar.copyOnWrite();
        ((etzt) etzqVar.instance).b = intValue;
        etzt etztVar = (etzt) etzqVar.build();
        etga.g(etztVar);
        return new etga(etztVar, arrayList, this.b);
    }

    public final void b() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((etfw) it.next()).a = false;
        }
    }

    public final void c(etfw etfwVar) {
        if (etfwVar.f != null) {
            throw new IllegalStateException("Entry has already been added to a KeysetHandle.Builder");
        }
        if (etfwVar.a) {
            b();
        }
        etfwVar.f = this;
        this.a.add(etfwVar);
    }
}
