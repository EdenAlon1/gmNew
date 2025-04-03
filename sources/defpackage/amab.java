package defpackage;

import j$.util.Optional;
import java.security.InvalidParameterException;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class amab implements amau {
    public static final cskc a = cskc.g("BugleContacts", "BugleContactPager");
    public final amav b;
    final AtomicReference c = new AtomicReference(Optional.empty());
    private final errl d;

    public amab(errl errlVar, amav amavVar) {
        this.d = errlVar;
        this.b = amavVar;
    }

    @Override // defpackage.amau
    public final amat a(Integer num) {
        return new alzy(num.intValue());
    }

    public final elfl b(final elfl elflVar, final elfl elflVar2, final int i) {
        return elfl.g(elfr.d(elflVar, elflVar2).a(new Callable() { // from class: alzz
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new ambm((engw) erqt.q(elfl.this), Math.min(((Integer) erqt.q(elflVar2)).intValue(), i), Math.max((r0 - r1) - r2.size(), 0));
            }
        }, this.d));
    }

    @Override // defpackage.amau
    public final elfl c(amat amatVar, int i) {
        ekzz f = eleg.f("BugleContactPager#loadAppend");
        try {
            f();
            if (i <= 0) {
                throw new InvalidParameterException(String.format("paging limit must be positive, found %d", Integer.valueOf(i)));
            }
            if (!(amatVar instanceof ambl)) {
                throw new InvalidParameterException("wrong PagingKey type, expecting OffsetPagingKey");
            }
            int a2 = ((ambl) amatVar).a();
            if (a2 < 0) {
                throw new InvalidParameterException(String.format("offset of paging key can't be negative, found %d", Integer.valueOf(a2)));
            }
            elfl b = b(this.b.d(a2, i), this.b.f(), a2);
            f.b(b);
            f.close();
            return b;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.amau
    public final elfl d(amat amatVar, int i) {
        elfl b;
        ekzz f = eleg.f("BugleContactPager#loadInitial");
        try {
            Optional optional = (Optional) this.c.getAndSet(Optional.empty());
            if (i <= 0) {
                throw new InvalidParameterException(String.format("paging limit must be positive, found %d", Integer.valueOf(i)));
            }
            if (amatVar == null) {
                if (optional.isPresent() && ((amaa) optional.get()).a == i) {
                    a.p("returning existing preload contacts state and skipping the query");
                    b = ((amaa) optional.get()).b;
                    f.b(b);
                } else {
                    b = b(this.b.d(0, i), this.b.f(), 0);
                    f.b(b);
                }
            } else {
                if (!(amatVar instanceof ambl)) {
                    throw new InvalidParameterException("wrong PagingKey type, expecting OffsetPagingKey");
                }
                int a2 = ((ambl) amatVar).a();
                if (a2 < 0) {
                    throw new InvalidParameterException(String.format("offset of paging key can't be negative, found %d", Integer.valueOf(a2)));
                }
                int max = Math.max(a2 - (i >> 1), 0);
                b = b(this.b.d(max, i), this.b.f(), max);
                f.b(b);
            }
            f.close();
            return b;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.amau
    public final elfl e(amat amatVar, int i) {
        ekzz f = eleg.f("BugleContactPager#loadPrepend");
        try {
            f();
            int i2 = 0;
            if (i <= 0) {
                throw new InvalidParameterException(String.format("paging limit must be positive, found %d", Integer.valueOf(i)));
            }
            if (!(amatVar instanceof ambl)) {
                throw new InvalidParameterException("wrong PagingKey type, expecting OffsetPagingKey");
            }
            int a2 = ((ambl) amatVar).a();
            if (a2 < 0) {
                throw new InvalidParameterException(String.format("offset of paging key can't be negative, found %d", Integer.valueOf(a2)));
            }
            int i3 = (a2 - i) + 1;
            if (i3 < 0) {
                i = a2 + 1;
            } else {
                i2 = i3;
            }
            elfl b = b(this.b.d(i2, i), this.b.f(), i2);
            f.b(b);
            f.close();
            return b;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void f() {
        a.p("cleaning up contacts preloaded state");
        this.c.set(Optional.empty());
    }
}
