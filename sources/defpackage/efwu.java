package defpackage;

import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import com.google.android.libraries.user.profile.photopicker.art.edit.EditableArtView;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efwu extends GestureDetector.SimpleOnGestureListener {
    final /* synthetic */ EditableArtView a;

    public efwu(EditableArtView editableArtView) {
        this.a = editableArtView;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            EditableArtView editableArtView = this.a;
            if (!editableArtView.n) {
                editableArtView.t.a(dvxh.b(), editableArtView);
            }
        }
        this.a.n = false;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (!this.a.u.isInProgress()) {
            EditableArtView editableArtView = this.a;
            if (!editableArtView.l) {
                if (!editableArtView.p && editableArtView.x != 1) {
                    Rect rect = new Rect(editableArtView.c);
                    int i = this.a.x;
                    int i2 = i - 1;
                    if (i == 0) {
                        throw null;
                    }
                    switch (i2) {
                        case 1:
                            int min = (int) Math.min(r8.c.right - motionEvent2.getX(), this.a.c.bottom - motionEvent2.getY());
                            rect.left = this.a.c.right - min;
                            rect.top = this.a.c.bottom - min;
                            break;
                        case 2:
                            int min2 = (int) Math.min(r8.c.right - motionEvent2.getX(), motionEvent2.getY() - this.a.c.top);
                            rect.left = this.a.c.right - min2;
                            rect.bottom = this.a.c.top + min2;
                            break;
                        case 3:
                            int min3 = (int) Math.min(motionEvent2.getX() - this.a.c.left, this.a.c.bottom - motionEvent2.getY());
                            rect.right = this.a.c.left + min3;
                            rect.top = this.a.c.bottom - min3;
                            break;
                        case 4:
                            int min4 = (int) Math.min(motionEvent2.getX() - this.a.c.left, motionEvent2.getY() - this.a.c.top);
                            rect.right = this.a.c.left + min4;
                            rect.bottom = this.a.c.top + min4;
                            break;
                        case 5:
                            int x = (int) (r8.c.left - motionEvent2.getX());
                            rect.left = this.a.c.left - x;
                            int i3 = x / 2;
                            rect.top = this.a.c.top - i3;
                            rect.bottom = this.a.c.bottom + i3;
                            break;
                        case 6:
                            int x2 = (int) (r8.c.right - motionEvent2.getX());
                            rect.right = this.a.c.right - x2;
                            int i4 = x2 / 2;
                            rect.top = this.a.c.top + i4;
                            rect.bottom = this.a.c.bottom - i4;
                            break;
                        case 7:
                            int y = (int) (r8.c.top - motionEvent2.getY());
                            rect.top = this.a.c.top - y;
                            int i5 = y / 2;
                            rect.left = this.a.c.left - i5;
                            rect.right = this.a.c.right + i5;
                            break;
                        case 8:
                            int y2 = (int) (r8.c.bottom - motionEvent2.getY());
                            rect.bottom = this.a.c.bottom - y2;
                            int i6 = y2 / 2;
                            rect.left = this.a.c.left + i6;
                            rect.right = this.a.c.right - i6;
                            break;
                    }
                    if (rect.width() > this.a.c.width()) {
                        if ((this.a.r.width() * r8.c.width()) / rect.width() > this.a.c.width()) {
                            this.a.f(rect);
                            this.a.r();
                        } else {
                            EditableArtView editableArtView2 = this.a;
                            editableArtView2.o(editableArtView2.m, editableArtView2.c.centerX(), this.a.c.centerY());
                            EditableArtView editableArtView3 = this.a;
                            editableArtView3.d.set(editableArtView3.c);
                            EditableArtView editableArtView4 = this.a;
                            editableArtView4.f.set(editableArtView4.e);
                        }
                    } else if (rect.width() > this.a.c.width() / 4) {
                        EditableArtView editableArtView5 = this.a;
                        if ((editableArtView5.r.width() * editableArtView5.c.width()) / rect.width() < this.a.c.width() * fdrj.a()) {
                            this.a.d.set(rect);
                            this.a.f.reset();
                            this.a.f.addCircle(r8.d.centerX(), this.a.d.centerY(), this.a.d.width() / 2.0f, Path.Direction.CCW);
                            this.a.invalidate();
                        }
                    }
                } else if (Math.abs(motionEvent2.getEventTime() - this.a.o) > fdrm.b()) {
                    EditableArtView editableArtView6 = this.a;
                    editableArtView6.p = true;
                    float f3 = -f;
                    float f4 = -f2;
                    editableArtView6.r.set(editableArtView6.q);
                    editableArtView6.b.mapRect(editableArtView6.r);
                    float f5 = editableArtView6.c.left;
                    float f6 = editableArtView6.c.right;
                    RectF rectF = editableArtView6.r;
                    float f7 = rectF.left;
                    float f8 = rectF.right;
                    float f9 = f6 - f5;
                    float max = f8 - f7 < f9 ? f5 + ((f9 - (f8 + f7)) / 2.0f) : Math.max(f6 - f8, Math.min(f5 - f7, f3));
                    float f10 = editableArtView6.c.top;
                    float f11 = editableArtView6.c.bottom;
                    RectF rectF2 = editableArtView6.r;
                    float f12 = rectF2.top;
                    float f13 = rectF2.bottom;
                    float f14 = f11 - f10;
                    editableArtView6.b.postTranslate(max, f13 - f12 < f14 ? f10 + ((f14 - (f13 + f12)) / 2.0f) : Math.max(f11 - f13, Math.min(f10 - f12, f4)));
                    editableArtView6.invalidate();
                    editableArtView6.s();
                }
            }
        }
        return true;
    }
}
