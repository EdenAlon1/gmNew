package com.google.android.gms.people.protomodel;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfwq;
import defpackage.dfxk;
import defpackage.dhjp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class PersonEntity extends AbstractSafeParcelable implements Person {
    public static final Parcelable.Creator<PersonEntity> CREATOR = new dhjp();
    public final String a;
    private final List b;
    private final List c;
    private final List d;
    private final List e;
    private final List f;
    private final List g;
    private List h;
    private List i;
    private List j;
    private List k;
    private List l;
    private List m;

    public PersonEntity(String str, List list, List list2, List list3, List list4, List list5, List list6) {
        this.a = str;
        this.b = list;
        this.c = list2;
        this.d = list3;
        this.e = list4;
        this.f = list5;
        this.g = list6;
    }

    @Override // com.google.android.gms.people.protomodel.Person
    public final String a() {
        return this.a;
    }

    @Override // com.google.android.gms.people.protomodel.Person
    public final List b() {
        List list;
        if (this.m == null && (list = this.g) != null) {
            this.m = new ArrayList(list.size());
            Iterator it = this.g.iterator();
            while (it.hasNext()) {
                this.m.add((Photo) it.next());
            }
        }
        return this.m;
    }

    @Override // com.google.android.gms.people.protomodel.Person
    public final List c() {
        List list;
        if (this.l == null && (list = this.f) != null) {
            this.l = new ArrayList(list.size());
            Iterator it = this.f.iterator();
            while (it.hasNext()) {
                this.l.add((Birthday) it.next());
            }
        }
        return this.l;
    }

    @Override // defpackage.dfvc
    public final /* bridge */ /* synthetic */ Object d() {
        throw null;
    }

    @Override // com.google.android.gms.people.protomodel.Person
    public final List e() {
        List list;
        if (this.j == null && (list = this.d) != null) {
            this.j = new ArrayList(list.size());
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                this.j.add((Email) it.next());
            }
        }
        return this.j;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Person)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        Person person = (Person) obj;
        return dfwq.a(a(), person.a()) && dfwq.a(f(), person.f()) && dfwq.a(h(), person.h()) && dfwq.a(e(), person.e()) && dfwq.a(g(), person.g()) && dfwq.a(c(), person.c()) && dfwq.a(b(), person.b());
    }

    @Override // com.google.android.gms.people.protomodel.Person
    public final List f() {
        List list;
        if (this.h == null && (list = this.b) != null) {
            this.h = new ArrayList(list.size());
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                this.h.add((Name) it.next());
            }
        }
        return this.h;
    }

    @Override // com.google.android.gms.people.protomodel.Person
    public final List g() {
        List list;
        if (this.k == null && (list = this.e) != null) {
            this.k = new ArrayList(list.size());
            Iterator it = this.e.iterator();
            while (it.hasNext()) {
                this.k.add((Phone) it.next());
            }
        }
        return this.k;
    }

    @Override // com.google.android.gms.people.protomodel.Person
    public final List h() {
        List list;
        if (this.i == null && (list = this.c) != null) {
            this.i = new ArrayList(list.size());
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                this.i.add((Photo) it.next());
            }
        }
        return this.i;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{a(), f(), h(), e(), g(), c(), b()});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = dfxk.a(parcel);
        dfxk.m(parcel, 2, str, false);
        dfxk.n(parcel, 4, f(), false);
        dfxk.n(parcel, 5, h(), false);
        dfxk.n(parcel, 9, c(), false);
        dfxk.n(parcel, 11, e(), false);
        dfxk.n(parcel, 13, g(), false);
        dfxk.n(parcel, 148, b(), false);
        dfxk.c(parcel, a);
    }
}
