package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.ComplianceOptions;
import com.google.android.gms.people.internal.IPeopleService;
import com.google.android.gms.people.internal.PeopleClientImpl;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ebyu implements ebwq {
    public static final /* synthetic */ int b = 0;
    private static final dhgd c;
    private final Context d;
    private final dhgf e;
    private final dhgl f;
    private final dhgh g;
    private final Executor h;
    private final ebwg i;
    private final dfpi j;
    public final CopyOnWriteArrayList a = new CopyOnWriteArrayList();
    private final dhgi k = new dhgi() { // from class: ebyq
        @Override // defpackage.dhgi
        public final void a() {
            Iterator it = ebyu.this.a.iterator();
            while (it.hasNext()) {
                ((ejhg) it.next()).a();
            }
        }
    };

    static {
        dhgd dhgdVar = new dhgd();
        dhgdVar.a = 1;
        c = dhgdVar;
    }

    public ebyu(Context context, dhgf dhgfVar, dhgl dhglVar, dhgh dhghVar, ebwg ebwgVar, Executor executor, dfpi dfpiVar) {
        this.d = context;
        this.e = dhgfVar;
        this.f = dhglVar;
        this.g = dhghVar;
        this.h = executor;
        this.i = ebwgVar;
        this.j = dfpiVar;
    }

    public static Object h(ListenableFuture listenableFuture, String str) {
        try {
            return erqt.q(listenableFuture);
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if ((cause instanceof dfqd) || (cause instanceof dfqc)) {
                throw e;
            }
            Log.e("OneGoogle", String.format("Failed to load %s. Exception: %s", str, eboa.a(cause)));
            return null;
        }
    }

    private final ListenableFuture i(int i) {
        return dfqf.g(i) ? erqt.h(new dfqd(i, "Google Play Services not available", this.j.j(this.d, i, null))) : erqt.h(new dfqc(i));
    }

    @Override // defpackage.ebwq
    public final ListenableFuture a() {
        return c();
    }

    @Override // defpackage.ebwq
    public final ListenableFuture b(final String str) {
        return erny.f(c(), eldl.a(new emwl() { // from class: ebys
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                engw engwVar = (engw) obj;
                int i = ebyu.b;
                int size = engwVar.size();
                int i2 = 0;
                while (i2 < size) {
                    String str2 = str;
                    ebwn ebwnVar = (ebwn) engwVar.get(i2);
                    i2++;
                    if (str2.equals(ebwnVar.a())) {
                        return ebwnVar;
                    }
                }
                return null;
            }
        }), erpp.a);
    }

    @Override // defpackage.ebwq
    public final ListenableFuture c() {
        final ListenableFuture a;
        dfpi dfpiVar = this.j;
        Context context = this.d;
        final ListenableFuture a2 = this.i.a();
        int i = dfpiVar.i(context, 10000000);
        if (i != 0) {
            a = i(i);
        } else {
            dhgf dhgfVar = this.e;
            dhgd dhgdVar = c;
            dfqs dfqsVar = dhgq.a;
            dfre dfreVar = dhgfVar.k;
            dhjc dhjcVar = new dhjc(dfreVar, dhgdVar);
            dfreVar.b(dhjcVar);
            a = ebza.a(dhjcVar, eldl.a(new emwl() { // from class: ebyt
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    int i2 = ebyu.b;
                    dhjh c2 = ((dhge) obj).c();
                    ArrayList arrayList = new ArrayList();
                    dfuw dfuwVar = new dfuw(c2);
                    while (dfuwVar.hasNext()) {
                        dhis dhisVar = (dhis) dfuwVar.next();
                        if (!dhisVar.a.e()) {
                            arrayList.add(ebyv.a.apply(dhisVar));
                        }
                    }
                    return engw.n(arrayList);
                }
            }), erpp.a);
        }
        final ebwk ebwkVar = (ebwk) this.i;
        final ListenableFuture h = elfr.h(new Callable() { // from class: ebwi
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Arrays.asList(dezv.a(ebwk.this.b, ebwk.a));
            }
        }, ebwkVar.c);
        return elfr.b(a2, a, h).a(new Callable() { // from class: ebyr
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                boolean z;
                List list = (List) ebyu.h(ListenableFuture.this, "device accounts");
                List<Account> list2 = (List) ebyu.h(h, "g1 accounts");
                engw engwVar = (engw) ebyu.h(a, "owners");
                if (list == null && list2 == null && engwVar == null) {
                    throw new ebwp();
                }
                ArrayList arrayList = new ArrayList();
                HashMap hashMap = new HashMap();
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ebyo.a(((Account) it.next()).name, arrayList, hashMap);
                    }
                    z = true;
                } else {
                    z = false;
                }
                if (list2 != null) {
                    for (Account account : list2) {
                        if (!z) {
                            ebyo.a(account.name, arrayList, hashMap);
                        }
                        ebwl ebwlVar = (ebwl) hashMap.get(account.name);
                        if (ebwlVar != null) {
                            ebwlVar.h(true);
                        }
                    }
                }
                if (engwVar != null) {
                    int size = engwVar.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        ebwn ebwnVar = (ebwn) engwVar.get(i2);
                        String a3 = ebwnVar.a();
                        if (!z) {
                            ebyo.a(a3, arrayList, hashMap);
                        }
                        ebwl ebwlVar2 = (ebwl) hashMap.get(a3);
                        if (ebwlVar2 != null) {
                            ebwlVar2.d(ebwnVar.d());
                            ebwlVar2.f(ebwnVar.f());
                            ebwlVar2.e(ebwnVar.e());
                            ebwlVar2.j(ebwnVar.g());
                            ebwlVar2.c(ebwnVar.b());
                            ebwlVar2.g(ebwnVar.k());
                        }
                    }
                }
                int i3 = engw.d;
                engr engrVar = new engr();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    engrVar.h(((ebwl) hashMap.get((String) it2.next())).a());
                }
                return engrVar.g();
            }
        }, erpp.a);
    }

    @Override // defpackage.ebwq
    public final void d(ejhg ejhgVar) {
        if (this.a.isEmpty()) {
            dhgl dhglVar = this.f;
            dftp f = dhglVar.f(this.k, dhgi.class.getName());
            final PeopleClientImpl.OnDataChangedBinderCallback onDataChangedBinderCallback = new PeopleClientImpl.OnDataChangedBinderCallback(f);
            dfuf dfufVar = new dfuf() { // from class: dhgj
                @Override // defpackage.dfuf
                public final void a(Object obj, Object obj2) {
                    PeopleClientImpl peopleClientImpl = (PeopleClientImpl) obj;
                    Context context = peopleClientImpl.c;
                    ComplianceOptions complianceOptions = new ComplianceOptions(-1, -1, 0, true);
                    ((IPeopleService) peopleClientImpl.w()).registerDataChangedListener(PeopleClientImpl.OnDataChangedBinderCallback.this, true, null, null, 1, new ApiMetadata(complianceOptions));
                    ((dhri) obj2).b(null);
                }
            };
            dfuf dfufVar2 = new dfuf() { // from class: dhgk
                @Override // defpackage.dfuf
                public final void a(Object obj, Object obj2) {
                    PeopleClientImpl peopleClientImpl = (PeopleClientImpl) obj;
                    Context context = peopleClientImpl.c;
                    ComplianceOptions complianceOptions = new ComplianceOptions(-1, -1, 0, true);
                    ((IPeopleService) peopleClientImpl.w()).registerDataChangedListener(PeopleClientImpl.OnDataChangedBinderCallback.this, false, null, null, 0, new ApiMetadata(complianceOptions));
                    ((dhri) obj2).b(true);
                }
            };
            dfud dfudVar = new dfud();
            dfudVar.a = dfufVar;
            dfudVar.b = dfufVar2;
            dfudVar.c = f;
            dfudVar.e = 2720;
            dhglVar.j(dfudVar.a());
        }
        this.a.add(ejhgVar);
    }

    @Override // defpackage.ebwq
    public final void e(ejhg ejhgVar) {
        this.a.remove(ejhgVar);
        if (this.a.isEmpty()) {
            this.f.k(dftq.a(this.k, dhgi.class.getName()), 2721);
        }
    }

    @Override // defpackage.ebwq
    public final ListenableFuture f(String str, int i) {
        return g(str, i);
    }

    @Override // defpackage.ebwq
    public final ListenableFuture g(String str, int i) {
        int i2 = this.j.i(this.d, 10400000);
        if (i2 != 0) {
            return i(i2);
        }
        dhgh dhghVar = this.g;
        int a = ebwf.a(i);
        dfqs dfqsVar = dhgq.a;
        dfre dfreVar = dhghVar.k;
        dhjd dhjdVar = new dhjd(dfreVar, str, a);
        dfreVar.b(dhjdVar);
        return ebza.a(dhjdVar, new emwl() { // from class: ebyp
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                int i3 = ebyu.b;
                ParcelFileDescriptor c2 = ((dhgg) obj).c();
                if (c2 == null) {
                    return null;
                }
                try {
                    ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(c2);
                    try {
                        Bitmap decodeStream = BitmapFactory.decodeStream(autoCloseInputStream);
                        autoCloseInputStream.close();
                        return decodeStream;
                    } finally {
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }, this.h);
    }
}
