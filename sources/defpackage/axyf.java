package defpackage;

import android.net.Uri;
import android.provider.ContactsContract;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axyf extends ffhv implements ffjm {
    int a;
    final /* synthetic */ axyy b;
    final /* synthetic */ List c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axyf(ffgu ffguVar, axyy axyyVar, List list) {
        super(2, ffguVar);
        this.b = axyyVar;
        this.c = list;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((axyf) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Closeable closeable;
        Throwable th;
        ffhh ffhhVar = ffhh.a;
        if (this.a != 0) {
            closeable = (Closeable) this.d;
            try {
                ffci.b(obj);
            } catch (Throwable th2) {
                th = th2;
                try {
                    throw th;
                } catch (Throwable th3) {
                    ffig.a(closeable, th);
                    throw th3;
                }
            }
        } else {
            ffci.b(obj);
            ekzz f = eleg.f("Cp2DataService#queryContactsExist");
            try {
                axyy axyyVar = this.b;
                List list = this.c;
                Uri uri = ContactsContract.Contacts.CONTENT_URI;
                uri.getClass();
                this.d = f;
                this.a = 1;
                Object B = axyyVar.B(list, uri, false, this);
                if (B == ffhhVar) {
                    return ffhhVar;
                }
                closeable = f;
                obj = B;
            } catch (Throwable th4) {
                closeable = f;
                th = th4;
                throw th;
            }
        }
        List list2 = (List) obj;
        List list3 = this.c;
        ArrayList arrayList = new ArrayList(ffdx.n(list3, 10));
        Iterator it = list3.iterator();
        while (it.hasNext()) {
            arrayList.add(Boolean.valueOf(list2.contains(new Long(((Number) it.next()).longValue()))));
        }
        ffig.a(closeable, null);
        return arrayList;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        axyf axyfVar = new axyf(ffguVar, this.b, this.c);
        axyfVar.d = obj;
        return axyfVar;
    }
}
