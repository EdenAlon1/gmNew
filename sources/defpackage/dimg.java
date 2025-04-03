package defpackage;

import android.text.TextUtils;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dimg {
    public String a;
    public String d;
    public String e;
    public String g;
    public dimb h;
    public final boolean i;
    public boolean j;
    public final dime b = new dime(dimb.FULL);
    public dimi c = new dimi();
    public final List f = new ArrayList();

    public dimg(dimb dimbVar, String str, boolean z, boolean z2) {
        dilt diltVar = dilt.PENDING;
        this.g = str;
        this.h = dimbVar;
        this.i = z;
        this.j = z2;
    }

    private static Optional i(List list, String str, ctvb ctvbVar) {
        if (str == null) {
            return Optional.empty();
        }
        String k = dkut.k(str, ctvbVar);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            dils dilsVar = (dils) it.next();
            String str2 = dilsVar.j;
            if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(k) && str2.contains(k)) {
                return Optional.of(dilsVar);
            }
        }
        return Optional.empty();
    }

    private static boolean j(dils dilsVar) {
        if (!dilsVar.c.b()) {
            return false;
        }
        if (dilsVar.f != dilr.DEPARTED) {
            if (dilsVar.f != dilr.FAILED) {
                return false;
            }
            Optional optional = dilsVar.g;
            if (optional.isEmpty() || ((dilo) optional.get()).a != 603) {
                return false;
            }
        }
        return true;
    }

    private static boolean k(dils dilsVar) {
        if (dilsVar.c.b()) {
            return dilsVar.f == dilr.BOOTED || dilsVar.f == dilr.BUSY;
        }
        return false;
    }

    private static final void l(Optional optional, Optional optional2) {
        if (optional2.isEmpty() || !((dils) optional2.get()).b()) {
            dkty.g("Invalid endpoint should not be in the update", new Object[0]);
            return;
        }
        if (k((dils) optional2.get())) {
            dkty.g("Temporarily disconnected endpoint should not be in the update: %s", optional2);
            return;
        }
        if (optional.isEmpty()) {
            if (((dils) optional2.get()).c.a() || j((dils) optional2.get())) {
                optional2.get();
                return;
            }
            return;
        }
        dilt diltVar = ((dils) optional.get()).c;
        dilt diltVar2 = ((dils) optional2.get()).c;
        if (!diltVar.b() && diltVar2.b()) {
            dkty.k("Endpoint needs to be notified because it has disconnected: %s", diltVar2);
        }
        if (diltVar.a() || !diltVar2.a()) {
            return;
        }
        dkty.k("Endpoint needs to be notified because it has connected: %s", diltVar2);
    }

    public final dilt a() {
        Optional b = b();
        if (!b.isEmpty()) {
            return ((dils) b.get()).c;
        }
        dkty.g("User contains no endpoints", new Object[0]);
        return dilt.DISCONNECTED;
    }

    public final Optional b() {
        Optional empty = Optional.empty();
        for (dils dilsVar : this.f) {
            if (dilsVar.b() && dilsVar.k != dimb.DELETED) {
                if (dilsVar.c.a()) {
                    return Optional.of(dilsVar);
                }
                empty = Optional.of(dilsVar);
            }
        }
        return empty;
    }

    final void c() {
        for (dils dilsVar : this.f) {
            this.h = dimb.DELETED;
            dilsVar.c = dilt.DISCONNECTED;
            dilsVar.f = dilr.DEPARTED;
            dilsVar.k = dimb.FULL;
            dilsVar.a = null;
            dilsVar.b = Optional.empty();
            dilsVar.d = dilw.UNKNOWN;
            dilsVar.e = Optional.empty();
            dilsVar.i = Optional.empty();
            dilsVar.h.clear();
        }
    }

    final void d(dimg dimgVar, ctvb ctvbVar) {
        Optional empty;
        if (dimgVar.h()) {
            ArrayList arrayList = new ArrayList(this.f);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                dils dilsVar = (dils) arrayList.get(i);
                if (!dilsVar.b() || dilsVar.k == dimb.DELETED) {
                    dkty.q("Clearing out invalid endpoint: %s", dilsVar);
                    this.f.remove(dilsVar);
                }
            }
            dimb dimbVar = dimgVar.h;
            dimb dimbVar2 = dimb.FULL;
            int ordinal = dimbVar.ordinal();
            if (ordinal == 0) {
                dime dimeVar = dimgVar.b;
                this.e = dimgVar.e;
                this.a = dimgVar.a;
                this.d = dimgVar.d;
                List<dils> list = dimgVar.f;
                Optional b = b();
                if (b.isPresent()) {
                    b = Optional.of(new dils((dils) b.get()));
                }
                Iterator it = this.f.iterator();
                while (it.hasNext()) {
                    dils dilsVar2 = (dils) it.next();
                    Optional i2 = i(list, dilsVar2.j, ctvbVar);
                    if (!i2.isPresent()) {
                        it.remove();
                    } else if (((dils) i2.get()).b() && k((dils) i2.get())) {
                        dkty.k("Skipping temporary disconnect endpoint during full update: %s", i2);
                    } else {
                        dilsVar2.a((dils) i2.get());
                    }
                }
                for (dils dilsVar3 : list) {
                    if (!dilsVar3.b()) {
                        dkty.k("Skipping invalid endpoint during full update: %s", dilsVar3);
                    } else if (k(dilsVar3)) {
                        dkty.k("Skipping temporary disconnect endpoint during full update: %s", dilsVar3);
                    } else if (!i(this.f, dilsVar3.j, ctvbVar).isPresent()) {
                        this.f.add(dilsVar3);
                    }
                }
                l(b, b());
                e();
                this.c = dimgVar.c;
                return;
            }
            if (ordinal != 1) {
                if (ordinal != 2) {
                    return;
                }
                c();
                return;
            }
            if (!dimgVar.b.isEmpty()) {
                dime dimeVar2 = dimgVar.b;
            }
            String str = dimgVar.e;
            if (str != null) {
                this.e = str;
            }
            String str2 = dimgVar.a;
            if (str2 != null) {
                this.a = str2;
            }
            String str3 = dimgVar.d;
            if (str3 != null) {
                this.d = str3;
            }
            if (!dimgVar.f.isEmpty()) {
                List<dils> list2 = dimgVar.f;
                Optional b2 = b();
                if (b2.isPresent()) {
                    b2 = Optional.of(new dils((dils) b2.get()));
                }
                for (dils dilsVar4 : list2) {
                    if (!dilsVar4.b()) {
                        dkty.k("Skipping invalid endpoint during partial update: %s", dilsVar4);
                    } else if (k(dilsVar4)) {
                        dkty.k("Skipping temporary disconnect endpoint during partial update: %s", dilsVar4);
                    } else {
                        String str4 = dilsVar4.j;
                        Iterator it2 = this.f.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                empty = Optional.empty();
                                break;
                            }
                            dils dilsVar5 = (dils) it2.next();
                            if (dilsVar5.b()) {
                                String str5 = dilsVar5.j;
                                if (str5 == null) {
                                    throw new IllegalStateException("Local entity is null");
                                }
                                if (str5.equals(str4)) {
                                    empty = Optional.of(dilsVar5);
                                    break;
                                }
                            } else {
                                dkty.g("User contains invalid endpoint!", new Object[0]);
                            }
                        }
                        if (empty.isEmpty()) {
                            this.f.add(dilsVar4);
                        } else {
                            ((dils) empty.get()).a(dilsVar4);
                        }
                    }
                }
                l(b2, b());
                e();
            }
            if (dimgVar.c.isEmpty()) {
                return;
            }
            this.c = dimgVar.c;
        }
    }

    public final void e() {
        this.j = a().a();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof dimg)) {
            return false;
        }
        dimg dimgVar = (dimg) obj;
        return this.h == dimgVar.h && this.j == dimgVar.j && this.i == dimgVar.i && TextUtils.equals(this.g, dimgVar.g) && TextUtils.equals(this.a, dimgVar.a) && TextUtils.equals(this.d, dimgVar.d) && TextUtils.equals(this.e, dimgVar.e) && this.f.equals(dimgVar.f) && this.b.equals(dimgVar.b) && this.c.equals(dimgVar.c);
    }

    final void f() {
        dilt diltVar;
        if (h()) {
            Optional b = b();
            if (!b.isPresent() || !((dils) b.get()).b() || (diltVar = ((dils) b.get()).c) == dilt.PENDING || diltVar == dilt.DIALING_IN || diltVar == dilt.DIALING_OUT || diltVar == dilt.ALERTING || diltVar == dilt.DISCONNECTING || k((dils) b.get())) {
                return;
            }
            b.get();
        }
    }

    public final boolean g() {
        Optional b = b();
        return (b.isEmpty() || j((dils) b.get())) ? false : true;
    }

    public final boolean h() {
        if (TextUtils.isEmpty(this.g)) {
            dkty.q("Invalid user. Entity is empty.", new Object[0]);
            return false;
        }
        if (this.h == dimb.NONE) {
            dkty.q("Invalid user. State is NONE.", new Object[0]);
            return false;
        }
        if (this.h != dimb.FULL || !this.f.isEmpty()) {
            return true;
        }
        dkty.q("Invalid user. Full state contains no endpoints.", new Object[0]);
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.h, Boolean.valueOf(this.j), Boolean.valueOf(this.i), this.g, this.a, this.d, this.e, this.f, this.b, this.c});
    }

    public final String toString() {
        String c = dktx.USER_ID.c(this.a);
        String c2 = dktx.USER_ID.c(this.g);
        String valueOf = String.valueOf(this.h);
        List list = this.f;
        return "User [mDisplaytext=" + c + ", mEntity=" + c2 + ", mState=" + valueOf + ", mYourOwn=" + this.i + ", mHasJoined=" + this.j + ", mEndpoints=" + list.toString() + "]";
    }
}
