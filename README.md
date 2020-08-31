# SpringTrainingDemo
p {
  font-family: Lato;
}

.data {
  display: block;
  width: 95vw;
  max-height: 500px;
  overflow: auto;}

.table {
  width: 100vw;
  max-width: 100%;
/* overflow: auto;*/
  margin-bottom: 10px;
  display: table;
  border-collapse: collapse;
  margin: 0px;
  background-color: rgb(238, 238, 238);
}

.row,
.header-row {
  display: table-row;
  min-height: 36px !important;
}

.cell,
.header-cell {
  word-wrap: initial;
  display: table-cell;
  padding: 0px 5px;
  line-break: unset;
  width: fit-content;
  white-space: nowrap;
  overflow: hidden;
  vertical-align: middle;
  text-align: center;
}

.header-row,
.header-cell {
  margin: 0 auto;
  min-height: 100px !important;
  text-align: center;
  vertical-align: middle;
  align-self: center;
}

.sort-header {
  display: flex;
  align-content: center;
  text-align: center;
  justify-content: center;
  font-size: 12pt;
}

.header-cell {
  font-weight: bold;
}


:host {
  display: block;
  height: 100%;
}

.mat-card {
  min-width: fit-content !important;
  max-width: fit-content !important;
}
