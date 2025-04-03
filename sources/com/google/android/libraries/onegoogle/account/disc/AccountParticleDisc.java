package com.google.android.libraries.onegoogle.account.disc;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import com.google.android.libraries.onegoogle.account.disc.DrawableBadgeViewHolder;
import defpackage.eave;
import defpackage.eavy;
import defpackage.eawc;
import defpackage.eawd;
import defpackage.eawt;
import defpackage.eawu;
import defpackage.eaww;
import defpackage.eawy;
import defpackage.eawz;
import defpackage.eaxb;
import defpackage.eaxm;
import defpackage.eaxo;
import defpackage.eaxq;
import defpackage.eaxu;
import defpackage.ebor;
import defpackage.ebpa;
import defpackage.ebvw;
import defpackage.efbd;
import defpackage.emux;
import defpackage.emxc;
import defpackage.emxf;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class AccountParticleDisc<AccountT> extends FrameLayout {
    public final AvatarView a;
    public final BadgeFrameLayout b;
    public final RingFrameLayout c;
    public final eaxo d;
    public final eaxq e;
    public DrawableBadgeViewHolder f;
    public eaxu g;
    public boolean h;
    public boolean i;
    public eawd j;
    public eaxb k;
    public Object l;
    public eawz m;
    public eave n;
    public emxc o;
    private final boolean p;
    private final CopyOnWriteArrayList q;
    private final eawy r;
    private final boolean s;
    private final int t;
    private ebvw u;
    private emxc v;

    public AccountParticleDisc(Context context) {
        this(context, null);
    }

    public static eawt b(eawz eawzVar) {
        eaww eawwVar;
        if (eawzVar == null || (eawwVar = eawzVar.a) == null) {
            return null;
        }
        return (eawt) eawwVar.a().f();
    }

    private final void u() {
        ebvw ebvwVar = this.u;
        if (ebvwVar == null) {
            return;
        }
        DrawableBadgeViewHolder drawableBadgeViewHolder = this.f;
        if (drawableBadgeViewHolder != null) {
            drawableBadgeViewHolder.c = ebvwVar;
            if (drawableBadgeViewHolder.e != null) {
                drawableBadgeViewHolder.a.ho(ebvwVar);
                drawableBadgeViewHolder.a.c(ebvwVar, drawableBadgeViewHolder.e);
            }
        }
        eaxu eaxuVar = this.g;
        if (eaxuVar != null) {
            ebvw ebvwVar2 = this.u;
            eaxuVar.d = ebvwVar2;
            if (eaxuVar.c != null) {
                eaxuVar.b.ho(ebvwVar2);
                eaxuVar.b.c(ebvwVar2, eaxuVar.c);
            }
        }
    }

    public final int a() {
        return this.a.d;
    }

    public final eawu c() {
        eaww eawwVar;
        eawz eawzVar = this.m;
        eawt eawtVar = (eawzVar == null || (eawwVar = eawzVar.a) == null) ? null : (eawt) eawwVar.a().f();
        if (eawtVar == null) {
            return null;
        }
        return eawtVar.b();
    }

    public final emxc d() {
        efbd.c();
        if (!this.i) {
            return emux.a;
        }
        eaxo eaxoVar = this.d;
        efbd.c();
        Object obj = eaxoVar.c;
        if (obj == null) {
            return emux.a;
        }
        eaxb eaxbVar = eaxoVar.b;
        if (eaxbVar != null) {
            emxc a = eaxo.a(eaxbVar.a(obj));
            if (a.g()) {
                return a;
            }
        }
        eaxb eaxbVar2 = eaxoVar.a;
        return eaxbVar2 != null ? eaxo.a(eaxbVar2.a(eaxoVar.c)) : emux.a;
    }

    public final String e() {
        if (this.o.g()) {
            return ((eawc) this.o.c()).a;
        }
        return null;
    }

    public final void f(eavy eavyVar) {
        this.q.add(eavyVar);
    }

    public final void g(ebvw ebvwVar) {
        if (this.h || this.i) {
            this.u = ebvwVar;
            u();
            if (this.h) {
                this.b.d();
                this.b.b(ebvwVar);
            }
            if (this.i) {
                this.c.d();
                this.c.b(ebvwVar);
            }
        }
    }

    public final void h() {
        if (this.h) {
            return;
        }
        emxf.m(!s(), "enableBadges is only allowed before calling initialize.");
        this.h = true;
    }

    public final void i(eawd eawdVar, final eave eaveVar) {
        eawdVar.getClass();
        this.j = eawdVar;
        this.n = eaveVar;
        if (this.s && this.v.g()) {
            int intValue = this.t - ((Integer) this.v.c()).intValue();
            int paddingLeft = (intValue - getPaddingLeft()) - getPaddingRight();
            int paddingTop = (intValue - getPaddingTop()) - getPaddingBottom();
            int max = Math.max(0, (int) Math.ceil(paddingLeft / 2.0f));
            int max2 = Math.max(0, (int) Math.ceil(paddingTop / 2.0f));
            setPadding(getPaddingLeft() + max, getPaddingTop() + max2, getPaddingRight() + max, getPaddingBottom() + max2);
        }
        if (this.h) {
            setClipChildren(false);
            setClipToPadding(false);
        }
        ebpa.a(new Runnable() { // from class: eavt
            @Override // java.lang.Runnable
            public final void run() {
                AccountParticleDisc accountParticleDisc = AccountParticleDisc.this;
                final eaxi eaxiVar = new eaxi(accountParticleDisc.getResources());
                final eave eaveVar2 = eaveVar;
                eaxb eaxbVar = new eaxb() { // from class: eaxh
                    /* JADX WARN: Type inference failed for: r2v0, types: [eaxg] */
                    @Override // defpackage.eaxb
                    public final eawz a(Object obj) {
                        eavi a = eaveVar2.a(obj);
                        eaww eawwVar = null;
                        if (a != null && ((eavg) a).a) {
                            if (eaxi.a == null) {
                                eaxi.a = new eawc(new Object() { // from class: eaxg
                                }, null, eaxi.this.b.getString(R.string.og_google_one_account_a11y), 0);
                            }
                            eawa eawaVar = new eawa();
                            eawaVar.b = emxc.j(eaxi.a);
                            eawwVar = eawaVar.a();
                        }
                        return new eawz(eawwVar);
                    }
                };
                efbd.c();
                eaxo eaxoVar = accountParticleDisc.d;
                eaxoVar.c(eaxoVar.a, eaxoVar.c);
                eaxoVar.a = eaxbVar;
                eaxoVar.b(eaxbVar, eaxoVar.c);
            }
        });
        if (this.i) {
            this.g = new eaxu(this.a, this.c);
        }
        if (this.h) {
            this.f = new DrawableBadgeViewHolder(this.b, this.a);
        }
        u();
    }

    public final void j() {
        Iterator it = this.q.iterator();
        while (it.hasNext()) {
            ((eavy) it.next()).a();
        }
    }

    public final void k(eavy eavyVar) {
        this.q.remove(eavyVar);
    }

    public final void l(final Object obj) {
        ebpa.a(new Runnable() { // from class: eavw
            /* JADX WARN: Code restructure failed: missing block: B:10:0x005e, code lost:
            
                if (r2 == null) goto L18;
             */
            /* JADX WARN: Code restructure failed: missing block: B:11:0x0060, code lost:
            
                r2.b(r0.o);
             */
            /* JADX WARN: Code restructure failed: missing block: B:12:0x0065, code lost:
            
                r2 = r0.a;
                defpackage.efbd.c();
                r2.g(true ^ r5);
                r4 = new defpackage.eavx(r0, r1, r2);
                r2.i = r4;
             */
            /* JADX WARN: Code restructure failed: missing block: B:13:0x0079, code lost:
            
                if (r2.d == Integer.MIN_VALUE) goto L21;
             */
            /* JADX WARN: Code restructure failed: missing block: B:14:0x007b, code lost:
            
                r4.run();
             */
            /* JADX WARN: Code restructure failed: missing block: B:15:0x007e, code lost:
            
                r0.q();
                r1 = r0.f;
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x0083, code lost:
            
                if (r1 == null) goto L24;
             */
            /* JADX WARN: Code restructure failed: missing block: B:17:0x0085, code lost:
            
                r1.a(com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc.b(r0.m), false);
             */
            /* JADX WARN: Code restructure failed: missing block: B:18:0x008e, code lost:
            
                r0.j();
             */
            /* JADX WARN: Code restructure failed: missing block: B:19:0x0091, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:22:0x002c, code lost:
            
                if (r0.n.b(r1).equals(r0.n.b(r2)) == false) goto L14;
             */
            /* JADX WARN: Code restructure failed: missing block: B:7:0x0030, code lost:
            
                if (r6 != r2) goto L14;
             */
            /* JADX WARN: Code restructure failed: missing block: B:8:0x0032, code lost:
            
                r0.m();
             */
            /* JADX WARN: Code restructure failed: missing block: B:9:0x0035, code lost:
            
                r0.l = r1;
                r2 = r0.d;
                defpackage.efbd.c();
                r2.c(r2.b, r2.c);
                r2.c(r2.a, r2.c);
                r2.c = r1;
                r2.b(r2.b, r1);
                r2.b(r2.a, r1);
                r0.o = r0.d();
                r2 = r0.g;
             */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    r8 = this;
                    com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc r0 = com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc.this
                    boolean r1 = r0.s()
                    java.lang.String r2 = "initialize must be called first"
                    defpackage.emxf.m(r1, r2)
                    java.lang.Object r1 = r2
                    java.lang.Object r2 = r0.l
                    r3 = 0
                    r4 = 1
                    if (r1 == 0) goto L15
                    r5 = r3
                    goto L16
                L15:
                    r5 = r4
                L16:
                    if (r1 == 0) goto L2f
                    if (r2 != 0) goto L1c
                    r6 = r1
                    goto L30
                L1c:
                    eave r6 = r0.n
                    java.lang.String r6 = r6.b(r1)
                    eave r7 = r0.n
                    java.lang.String r2 = r7.b(r2)
                    boolean r2 = r6.equals(r2)
                    if (r2 != 0) goto L35
                    goto L32
                L2f:
                    r6 = 0
                L30:
                    if (r6 == r2) goto L35
                L32:
                    r0.m()
                L35:
                    r0.l = r1
                    eaxo r2 = r0.d
                    defpackage.efbd.c()
                    eaxb r6 = r2.b
                    java.lang.Object r7 = r2.c
                    r2.c(r6, r7)
                    eaxb r6 = r2.a
                    java.lang.Object r7 = r2.c
                    r2.c(r6, r7)
                    r2.c = r1
                    eaxb r6 = r2.b
                    r2.b(r6, r1)
                    eaxb r6 = r2.a
                    r2.b(r6, r1)
                    emxc r2 = r0.d()
                    r0.o = r2
                    eaxu r2 = r0.g
                    if (r2 == 0) goto L65
                    emxc r6 = r0.o
                    r2.b(r6)
                L65:
                    com.google.android.libraries.onegoogle.account.disc.AvatarView r2 = r0.a
                    defpackage.efbd.c()
                    r4 = r4 ^ r5
                    r2.g(r4)
                    eavx r4 = new eavx
                    r4.<init>()
                    r2.i = r4
                    int r1 = r2.d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    if (r1 == r2) goto L7e
                    r4.run()
                L7e:
                    r0.q()
                    com.google.android.libraries.onegoogle.account.disc.DrawableBadgeViewHolder r1 = r0.f
                    if (r1 == 0) goto L8e
                    eawz r2 = r0.m
                    eawt r2 = com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc.b(r2)
                    r1.a(r2, r3)
                L8e:
                    r0.j()
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.eavw.run():void");
            }
        });
    }

    public final void m() {
        AvatarView avatarView = this.a;
        avatarView.setImageDrawable(avatarView.c);
        this.a.g(true);
    }

    public final void n(final eaxb eaxbVar) {
        emxf.m(this.h, "setDecorationRetriever is not allowed with false allowBadges.");
        this.k = eaxbVar;
        q();
        if (this.i) {
            ebpa.a(new Runnable() { // from class: eavq
                @Override // java.lang.Runnable
                public final void run() {
                    efbd.c();
                    AccountParticleDisc accountParticleDisc = AccountParticleDisc.this;
                    eaxo eaxoVar = accountParticleDisc.d;
                    eaxoVar.c(eaxoVar.b, eaxoVar.c);
                    eaxb eaxbVar2 = eaxbVar;
                    eaxoVar.b = eaxbVar2;
                    eaxoVar.b(eaxbVar2, eaxoVar.c);
                    accountParticleDisc.r();
                }
            });
        }
        p();
        j();
    }

    public final void o(int i) {
        int dimension;
        emxf.m(!s(), "setMaxDiscContentSize is only allowed before calling initialize.");
        this.v = emxc.j(Integer.valueOf(i));
        if (this.h || this.i || this.p) {
            dimension = (int) getResources().getDimension(((float) i) > getResources().getDimension(R.dimen.og_apd_min_avatar_size_for_legacy_large_ring) ? R.dimen.og_apd_min_padding_large_ring : R.dimen.og_apd_min_padding);
        } else {
            dimension = 0;
        }
        ViewGroup.LayoutParams layoutParams = this.a.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i;
        AvatarView avatarView = this.a;
        int i2 = i - (dimension + dimension);
        avatarView.h = true;
        avatarView.i(i2);
        avatarView.e(i2);
    }

    public final void p() {
        ebpa.a(new Runnable() { // from class: eavs
            @Override // java.lang.Runnable
            public final void run() {
                AccountParticleDisc accountParticleDisc = AccountParticleDisc.this;
                DrawableBadgeViewHolder drawableBadgeViewHolder = accountParticleDisc.f;
                if (drawableBadgeViewHolder != null) {
                    drawableBadgeViewHolder.a(AccountParticleDisc.b(accountParticleDisc.m), true);
                }
            }
        });
    }

    public final void q() {
        Object obj;
        eawz eawzVar = this.m;
        if (eawzVar != null) {
            eawzVar.b(this.r);
        }
        eaxb eaxbVar = this.k;
        eawz eawzVar2 = null;
        if (eaxbVar != null && (obj = this.l) != null) {
            eawzVar2 = eaxbVar.a(obj);
        }
        this.m = eawzVar2;
        if (eawzVar2 != null) {
            eawzVar2.a(this.r);
        }
    }

    public final void r() {
        efbd.c();
        emxc d = d();
        if (d.equals(this.o)) {
            return;
        }
        this.o = d;
        eaxu eaxuVar = this.g;
        if (eaxuVar != null) {
            efbd.c();
            eaxuVar.a(d, true);
        }
        j();
    }

    public final boolean s() {
        return this.j != null;
    }

    public final void t() {
        if (this.i) {
            return;
        }
        emxf.m(!s(), "setAllowRings is only allowed before calling initialize.");
        this.i = true;
    }

    public AccountParticleDisc(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.ogAccountParticleDiscStyle);
    }

    public AccountParticleDisc(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.q = new CopyOnWriteArrayList();
        this.r = new eawy() { // from class: eavu
            @Override // defpackage.eawy
            public final void a() {
                AccountParticleDisc accountParticleDisc = AccountParticleDisc.this;
                accountParticleDisc.p();
                accountParticleDisc.j();
            }
        };
        this.d = new eaxo(new eawy() { // from class: eavv
            @Override // defpackage.eawy
            public final void a() {
                final AccountParticleDisc accountParticleDisc = AccountParticleDisc.this;
                ebpa.a(new Runnable() { // from class: eavr
                    @Override // java.lang.Runnable
                    public final void run() {
                        AccountParticleDisc.this.r();
                    }
                });
            }
        });
        emux emuxVar = emux.a;
        this.v = emuxVar;
        this.o = emuxVar;
        LayoutInflater.from(context).inflate(R.layout.account_particle_disc, (ViewGroup) this, true);
        AvatarView avatarView = (AvatarView) findViewById(R.id.og_apd_internal_image_view);
        this.a = avatarView;
        this.b = (BadgeFrameLayout) findViewById(R.id.badge_wrapper);
        this.c = (RingFrameLayout) findViewById(R.id.ring_wrapper);
        this.e = new eaxq(getResources());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, eaxm.a, i, R.style.OneGoogle_AccountParticleDisc_DayNight);
        try {
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(5, Integer.MIN_VALUE);
            dimensionPixelSize = dimensionPixelSize == Integer.MIN_VALUE ? obtainStyledAttributes.getDimensionPixelSize(4, Integer.MIN_VALUE) : dimensionPixelSize;
            this.p = obtainStyledAttributes.getBoolean(0, true);
            this.i = obtainStyledAttributes.getBoolean(1, false);
            this.s = obtainStyledAttributes.getBoolean(3, false);
            this.t = obtainStyledAttributes.getDimensionPixelSize(2, getResources().getDimensionPixelSize(R.dimen.og_apd_default_disc_min_touch_target_size));
            boolean z = obtainStyledAttributes.getBoolean(6, true);
            Paint paint = avatarView.b;
            Resources resources = avatarView.getResources();
            int i2 = R.color.google_grey100;
            paint.setColor(resources.getColor(z ? R.color.google_grey900 : R.color.google_grey100));
            avatarView.b.setAlpha(30);
            Drawable drawable = avatarView.c;
            ebor.c(drawable, avatarView.getResources().getColor(true != z ? R.color.google_grey800 : i2));
            avatarView.c = drawable;
            avatarView.a.setColor(avatarView.getResources().getColor(true != z ? R.color.og_elevation_dark_5 : R.color.google_white));
            obtainStyledAttributes.recycle();
            m();
            if (dimensionPixelSize != Integer.MIN_VALUE) {
                o(dimensionPixelSize);
            }
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }
}
