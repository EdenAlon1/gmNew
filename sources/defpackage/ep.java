package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v4.app.FragmentContainerView;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ep implements LayoutInflater.Factory2 {
    final fr a;

    public ep(fr frVar) {
        this.a = frVar;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        gc o;
        if (FragmentContainerView.class.getName().equals(str)) {
            return new FragmentContainerView(context, attributeSet, this.a);
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ca.a);
            if (attributeValue == null) {
                attributeValue = obtainStyledAttributes.getString(0);
            }
            int resourceId = obtainStyledAttributes.getResourceId(1, -1);
            String string = obtainStyledAttributes.getString(2);
            obtainStyledAttributes.recycle();
            if (attributeValue != null) {
                ClassLoader classLoader = context.getClassLoader();
                int i = em.a;
                try {
                    if (ea.class.isAssignableFrom(em.a(classLoader, attributeValue))) {
                        int id = view != null ? view.getId() : 0;
                        if (id == -1) {
                            if (resourceId != -1) {
                                id = -1;
                            } else {
                                if (string == null) {
                                    throw new IllegalArgumentException(a.l(attributeValue, attributeSet, ": Must specify unique android:id, android:tag, or have a parent with an id for "));
                                }
                                id = -1;
                                resourceId = -1;
                            }
                        }
                        ea g = resourceId != -1 ? this.a.g(resourceId) : null;
                        if (g == null && string != null) {
                            g = this.a.h(string);
                        }
                        if (g == null && id != -1) {
                            g = this.a.g(id);
                        }
                        if (g == null) {
                            em l = this.a.l();
                            context.getClassLoader();
                            g = l.b(attributeValue);
                            g.v = true;
                            g.F = resourceId != 0 ? resourceId : id;
                            g.G = id;
                            g.H = string;
                            g.w = true;
                            g.B = this.a;
                            fr frVar = this.a;
                            g.C = frVar.o;
                            g.ak(frVar.o.c, attributeSet, g.h);
                            o = this.a.n(g);
                            if (fr.af(2)) {
                                Log.v("FragmentManager", "Fragment " + g + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                            }
                        } else {
                            if (g.w) {
                                throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                            }
                            g.w = true;
                            g.B = this.a;
                            fr frVar2 = this.a;
                            g.C = frVar2.o;
                            g.ak(frVar2.o.c, attributeSet, g.h);
                            o = this.a.o(g);
                            if (fr.af(2)) {
                                Log.v("FragmentManager", "Retained Fragment " + g + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                            }
                        }
                        ViewGroup viewGroup = (ViewGroup) view;
                        int i2 = lin.a;
                        g.getClass();
                        lio lioVar = new lio(g, viewGroup);
                        lin.d(lioVar);
                        lim b = lin.b(g);
                        if (b.b.contains(lil.DETECT_FRAGMENT_TAG_USAGE) && lin.e(b, g.getClass(), lioVar.getClass())) {
                            lin.c(b, lioVar);
                        }
                        g.P = viewGroup;
                        o.e();
                        o.d();
                        View view2 = g.Q;
                        if (view2 == null) {
                            throw new IllegalStateException(a.a(attributeValue, "Fragment ", " did not create a view."));
                        }
                        if (resourceId != 0) {
                            view2.setId(resourceId);
                        }
                        if (g.Q.getTag() == null) {
                            g.Q.setTag(string);
                        }
                        g.Q.addOnAttachStateChangeListener(new eo(this, o));
                        return g.Q;
                    }
                } catch (ClassNotFoundException unused) {
                }
            }
        }
        return null;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
