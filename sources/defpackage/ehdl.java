package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehdl implements ViewGroup.OnHierarchyChangeListener {
    public ViewGroup.OnHierarchyChangeListener a;
    final /* synthetic */ ChipGroup b;

    public ehdl(ChipGroup chipGroup) {
        this.b = chipGroup;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        if (view == this.b && (view2 instanceof Chip)) {
            if (view2.getId() == -1) {
                view2.setId(View.generateViewId());
            }
            ChipGroup chipGroup = this.b;
            Chip chip = (Chip) view2;
            Integer valueOf = Integer.valueOf(chip.getId());
            ehhm ehhmVar = chipGroup.a;
            ehhmVar.a.put(valueOf, chip);
            if (chip.isChecked()) {
                ehhmVar.d(chip);
            }
            chip.h(new ehhl(ehhmVar));
        }
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.a;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewAdded(view, view2);
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
        ChipGroup chipGroup = this.b;
        if (view == chipGroup && (view2 instanceof Chip)) {
            ehhm ehhmVar = chipGroup.a;
            Chip chip = (Chip) view2;
            chip.h(null);
            ehhmVar.a.remove(Integer.valueOf(chip.getId()));
            ehhmVar.b.remove(Integer.valueOf(chip.getId()));
        }
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.a;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewRemoved(view, view2);
        }
    }
}
