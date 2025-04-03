package com.google.android.libraries.user.profile.photopicker.edit;

import android.animation.ValueAnimator;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.net.Uri;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.AppCompatImageButton;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.user.profile.photopicker.common.view.error.FullscreenErrorView;
import com.google.android.libraries.user.profile.photopicker.edit.EditActivity;
import com.google.android.libraries.user.profile.photopicker.edit.EditablePhotoView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import defpackage.cg;
import defpackage.dvwz;
import defpackage.dvxb;
import defpackage.dvxc;
import defpackage.dvxh;
import defpackage.dvxi;
import defpackage.dvyc;
import defpackage.dwca;
import defpackage.dwck;
import defpackage.egab;
import defpackage.egaj;
import defpackage.egal;
import defpackage.egjt;
import defpackage.egju;
import defpackage.egjw;
import defpackage.egjy;
import defpackage.egkf;
import defpackage.egko;
import defpackage.egrb;
import defpackage.faze;
import defpackage.fazf;
import defpackage.fdrm;
import defpackage.im;
import defpackage.kud;
import defpackage.kvd;
import defpackage.kvo;
import defpackage.llh;
import defpackage.lmw;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class EditActivity extends egkf implements fazf {
    public EditablePhotoView A;
    public LinearProgressIndicator B;
    public FullscreenErrorView C;
    public BottomSheetBehavior D;
    public lmw n;
    public egrb o;
    public egaj p;
    public dvyc q;
    public dvxi r;
    public dvxb s;
    public egjw t;
    public dvxc u;
    public faze v;
    public dwck w;
    public egko x;
    public MaterialButton y;
    public AppCompatImageButton z;

    public final void B() {
        this.y.setEnabled(false);
        this.z.setEnabled(false);
    }

    public final void C() {
        this.y.setEnabled(true);
        this.z.setEnabled(true);
    }

    public final void D() {
        this.B.setVisibility(8);
        this.D.D(5);
        this.A.setVisibility(8);
        this.C.setVisibility(8);
    }

    public final void E(Uri uri) {
        this.t.c();
        int c = (int) fdrm.a.get().c();
        egaj egajVar = this.p;
        egal egalVar = new egal();
        egalVar.b();
        egalVar.d();
        egajVar.e(this, uri, egalVar, new egjt(this, c, c), new egju(this));
    }

    @Override // defpackage.fazf
    public final faze ab() {
        return this.v;
    }

    @Override // defpackage.abe, android.app.Activity
    public final void onBackPressed() {
        this.t.f(2);
        super.onBackPressed();
    }

    @Override // defpackage.egkf, defpackage.eg, defpackage.abe, defpackage.hl, android.app.Activity
    public final void onCreate(Bundle bundle) {
        egab.a(this);
        super.onCreate(bundle);
        this.t.a();
        if (!this.o.a() || getIntent().getData() == null) {
            this.t.f(4);
            finish();
            return;
        }
        setContentView(R.layout.photo_picker_edit_activity);
        dvwz a = this.q.b.a(89757);
        a.g(this.u);
        a.g(dwca.b());
        a.f(this.s);
        a.d(this);
        if (fdrm.o()) {
            this.q.b.a(89741).b(findViewById(R.id.photo_picker_edit_page));
        }
        Toolbar toolbar = (Toolbar) findViewById(R.id.photo_picker_toolbar);
        n(toolbar);
        im k = k();
        k.getClass();
        k.setDisplayHomeAsUpEnabled(true);
        k.setHomeActionContentDescription(R.string.abc_action_bar_up_description);
        k.setTitle(R.string.op3_edit_crop_and_rotate);
        dwck dwckVar = new dwck(this.q.b.a(92715).b(toolbar));
        this.w = dwckVar;
        dwckVar.c(89729).a(Integer.valueOf(R.id.photo_picker_navigation_button));
        if (fdrm.q()) {
            this.w.c(89740).a(Integer.valueOf(R.id.photo_picker_edit_info_menu_item));
        }
        toolbar.t(new View.OnClickListener() { // from class: egjm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditActivity editActivity = EditActivity.this;
                editActivity.r.b(dvxh.e(), editActivity.w.b(Integer.valueOf(R.id.photo_picker_navigation_button)));
                editActivity.onBackPressed();
            }
        });
        this.y = (MaterialButton) findViewById(R.id.photo_picker_accept_button);
        if (fdrm.q()) {
            this.y.setText(getIntent().getIntExtra("photo_accept_button_string", R.string.op3_edit_save));
        }
        this.z = (AppCompatImageButton) findViewById(R.id.photo_picker_edit_rotate_button);
        this.A = (EditablePhotoView) findViewById(R.id.photo_picker_photo_edit_view);
        this.B = (LinearProgressIndicator) findViewById(R.id.photo_picker_loading_view);
        this.C = (FullscreenErrorView) findViewById(R.id.photo_picker_error_view);
        this.q.b.a(97816).b(this.A);
        BottomSheetBehavior v = BottomSheetBehavior.v((ConstraintLayout) findViewById(R.id.photo_picker_edit_bottom_sheet));
        this.D = v;
        v.w = false;
        v.B(true);
        this.D.D(5);
        this.x = (egko) this.n.a(egko.class);
        E(getIntent().getData());
        this.q.b.a(89765).b(this.y);
        this.y.setOnClickListener(new View.OnClickListener() { // from class: egjn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                final Bitmap createBitmap;
                EditActivity editActivity = EditActivity.this;
                editActivity.t.e();
                final egko egkoVar = editActivity.x;
                EditablePhotoView editablePhotoView = editActivity.A;
                float intrinsicHeight = editablePhotoView.a.getIntrinsicHeight();
                float intrinsicWidth = editablePhotoView.a.getIntrinsicWidth();
                int i = -editablePhotoView.c.left;
                int i2 = -editablePhotoView.c.top;
                float b = editablePhotoView.b();
                float min = Math.min(intrinsicWidth / b, intrinsicHeight / b);
                if (min > fdrm.a()) {
                    createBitmap = Bitmap.createBitmap((int) fdrm.a(), (int) fdrm.a(), Bitmap.Config.ARGB_8888);
                } else {
                    int i3 = (int) min;
                    createBitmap = Bitmap.createBitmap(i3, i3, Bitmap.Config.ARGB_8888);
                }
                Canvas canvas = new Canvas(createBitmap);
                Matrix matrix = new Matrix(editablePhotoView.b);
                if (i + i2 != 0) {
                    matrix.postTranslate(i, i2);
                }
                float a2 = editablePhotoView.a();
                if (a2 != 0.0f) {
                    float f = 1.0f / a2;
                    matrix.postScale(f, f);
                }
                if (min > fdrm.a()) {
                    matrix.postScale(fdrm.a() / min, fdrm.a() / min);
                }
                canvas.concat(matrix);
                editablePhotoView.a.draw(canvas);
                if (egkoVar.i.compareAndSet(false, true)) {
                    emyg emygVar = egkoVar.g;
                    emygVar.e();
                    emygVar.f();
                    llg llgVar = egkoVar.h;
                    egkj egkjVar = new egkj();
                    egkjVar.a = 2;
                    llgVar.j(egkjVar.a());
                    erqt.r(erqt.m(new Callable() { // from class: egkm
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            egko egkoVar2 = egko.this;
                            egad egadVar = egkoVar2.e;
                            efzz efzzVar = egkoVar2.c;
                            Bitmap bitmap = createBitmap;
                            Uri a3 = egadVar.a("edited_photo.png");
                            efzzVar.b(bitmap, a3);
                            return a3;
                        }
                    }, egkoVar.d), new egkn(egkoVar), egkoVar.d);
                }
                editActivity.r.a(dvxh.e(), editActivity.y);
            }
        });
        this.q.b.a(89764).b(this.z);
        this.z.setOnClickListener(new View.OnClickListener() { // from class: egjo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditActivity editActivity = EditActivity.this;
                final EditablePhotoView editablePhotoView = editActivity.A;
                ValueAnimator valueAnimator = editablePhotoView.m;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    final Matrix matrix = new Matrix(editablePhotoView.b);
                    editablePhotoView.m = ValueAnimator.ofFloat(0.0f, -90.0f);
                    editablePhotoView.m.setInterpolator(new ljm());
                    editablePhotoView.m.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: egjz
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                            float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                            EditablePhotoView editablePhotoView2 = EditablePhotoView.this;
                            editablePhotoView2.b.set(matrix);
                            editablePhotoView2.b.postRotate(floatValue, editablePhotoView2.c.centerX(), editablePhotoView2.c.centerY());
                            editablePhotoView2.invalidate();
                            editablePhotoView2.f();
                        }
                    });
                    editablePhotoView.m.addListener(new egkc(editablePhotoView, matrix));
                    editablePhotoView.m.setDuration(fdrm.c());
                    editablePhotoView.m.start();
                }
                editActivity.r.a(dvxh.e(), editActivity.z);
            }
        });
        this.C.b(new View.OnClickListener() { // from class: egjp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditActivity editActivity = EditActivity.this;
                editActivity.E(editActivity.getIntent().getData());
            }
        });
        this.x.h.f(this, new llh() { // from class: egjq
            @Override // defpackage.llh
            public final void a(Object obj) {
                egkq egkqVar = (egkq) obj;
                int c = egkqVar.c() - 1;
                EditActivity editActivity = EditActivity.this;
                if (c == 1) {
                    editActivity.B();
                    return;
                }
                if (c != 3) {
                    if (c != 4) {
                        return;
                    }
                    editActivity.t.d((exfw) egkqVar.a().c());
                    editActivity.C();
                    return;
                }
                editActivity.t.d((exfw) egkqVar.a().c());
                editActivity.setResult(-1, new Intent().setData((Uri) egkqVar.b().c()));
                editActivity.t.f(1);
                editActivity.finish();
            }
        });
        if (fdrm.i()) {
            View findViewById = findViewById(R.id.photo_picker_edit_page);
            kud kudVar = new kud() { // from class: egjr
                @Override // defpackage.kud
                public final kxh ey(View view, kxh kxhVar) {
                    kpt f = kxhVar.f(519);
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                    marginLayoutParams.leftMargin = f.b;
                    marginLayoutParams.bottomMargin = f.e;
                    marginLayoutParams.rightMargin = f.d;
                    marginLayoutParams.topMargin = f.c;
                    view.setLayoutParams(marginLayoutParams);
                    return kxh.a;
                }
            };
            int[] iArr = kvo.a;
            kvd.k(findViewById, kudVar);
        }
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.photo_picker_edit_menu, menu);
        if (fdrm.q()) {
            return true;
        }
        this.w.c(89740).a(Integer.valueOf(R.id.photo_picker_edit_info_menu_item));
        return true;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.photo_picker_edit_info_menu_item) {
            return false;
        }
        this.r.b(dvxh.e(), this.w.b(Integer.valueOf(R.id.photo_picker_edit_info_menu_item)));
        cg cgVar = new cg(a());
        cgVar.u(new egjy(), null);
        cgVar.c();
        return true;
    }
}
